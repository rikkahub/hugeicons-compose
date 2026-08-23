package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Slice: ImageVector
    get() {
        if (_slice != null) {
            return _slice!!
        }
        _slice = ImageVector.Builder(
            name = "Slice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.9478f, 4.02397f)
            lineTo(7.60473f, 14.416f)
            lineTo(10.1274f, 16.9507f)
            lineTo(20.4705f, 6.55862f)
            curveTo(21.1671f, 5.8587f, 21.1671f, 4.72389f, 20.4705f, 4.02397f)
            curveTo(19.7738f, 3.32404f, 18.6444f, 3.32404f, 17.9478f, 4.02397f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.60199f, 14.416f)
            lineTo(4.86457f, 17.1664f)
            curveTo(3.51308f, 18.5243f, 2.83734f, 19.2033f, 3.02116f, 19.7898f)
            curveTo(3.03888f, 19.8464f, 3.0615f, 19.9012f, 3.08877f, 19.9538f)
            curveTo(3.37159f, 20.4992f, 4.32724f, 20.4992f, 6.23853f, 20.4992f)
            horizontalLineTo(6.59291f)
            curveTo(8.01012f, 20.4992f, 8.71873f, 20.4992f, 9.22775f, 20.1575f)
            curveTo(9.44811f, 20.0095f, 9.63732f, 19.8194f, 9.78456f, 19.598f)
            curveTo(10.1247f, 19.0866f, 10.1247f, 18.3746f, 10.1247f, 16.9507f)
        }
        }.build()

        return _slice!!
    }

private var _slice: ImageVector? = null
