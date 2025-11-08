package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = ImageVector.Builder(
            name = "Pi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9.3f)
        curveTo(3f, 7.5f, 5.06126f, 5.7f, 7.68468f, 5.7f)
        lineTo(16.9574f, 5.7f)
        curveTo(19.2f, 5.7f, 21f, 4.35f, 21f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.502f, 6f)
        lineTo(15.6072f, 18.3139f)
        curveTo(15.5177f, 19.7653f, 16.5097f, 20.9999f, 17.7654f, 20.9999f)
        curveTo(18.6967f, 20.9999f, 19.5236f, 20.3093f, 19.8181f, 19.2855f)
        lineTo(20.1016f, 18.2999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 6f)
        curveTo(9.86667f, 9.0625f, 9.6f, 14.75f, 9.2f, 16.5f)
        curveTo(8.8f, 18.25f, 8f, 20f, 6f, 20f)
        }
        }.build()

        return _pi!!
    }

private var _pi: ImageVector? = null
