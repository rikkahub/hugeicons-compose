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

val HugeIcons.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = ImageVector.Builder(
            name = "Bolt",
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
            moveTo(10.0437f, 21f)
            horizontalLineTo(13.9563f)
            curveTo(15.6662f, 21f, 16.5211f, 21f, 17.2206f, 20.5856f)
            curveTo(17.9201f, 20.1712f, 18.3353f, 19.4188f, 19.1657f, 17.9139f)
            lineTo(20.8211f, 14.9139f)
            curveTo(21.607f, 13.4895f, 22f, 12.7774f, 22f, 12f)
            curveTo(22f, 11.2226f, 21.607f, 10.5105f, 20.8211f, 9.08614f)
            lineTo(19.1657f, 6.08614f)
            curveTo(18.3353f, 4.58123f, 17.9201f, 3.82877f, 17.2206f, 3.41439f)
            curveTo(16.5211f, 3f, 15.6662f, 3f, 13.9563f, 3f)
            lineTo(10.0437f, 3f)
            curveTo(8.33384f, 3f, 7.47888f, 3f, 6.77939f, 3.41439f)
            curveTo(6.0799f, 3.82877f, 5.6647f, 4.58123f, 4.83429f, 6.08614f)
            lineTo(3.1789f, 9.08614f)
            curveTo(2.39297f, 10.5105f, 2f, 11.2226f, 2f, 12f)
            curveTo(2f, 12.7774f, 2.39297f, 13.4895f, 3.1789f, 14.9139f)
            lineTo(4.83429f, 17.9139f)
            curveTo(5.6647f, 19.4188f, 6.0799f, 20.1712f, 6.77939f, 20.5856f)
            curveTo(7.47888f, 21f, 8.33384f, 21f, 10.0437f, 21f)
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
            moveTo(12f, 16f)
            curveTo(14.2091f, 16f, 16f, 14.2091f, 16f, 12f)
            curveTo(16f, 9.79086f, 14.2091f, 8f, 12f, 8f)
            curveTo(9.79086f, 8f, 8f, 9.79086f, 8f, 12f)
            curveTo(8f, 14.2091f, 9.79086f, 16f, 12f, 16f)
            close()
        }
        }.build()

        return _bolt!!
    }

private var _bolt: ImageVector? = null
