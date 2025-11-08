package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ModernTv: ImageVector
    get() {
        if (_modernTv != null) {
            return _modernTv!!
        }
        _modernTv = ImageVector.Builder(
            name = "ModernTv",
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
        moveTo(2f, 10f)
        curveTo(2f, 6.22876f, 2f, 4.34315f, 3.17157f, 3.17157f)
        curveTo(4.34315f, 2f, 6.22876f, 2f, 10f, 2f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 2f, 19.6569f, 2f, 20.8284f, 3.17157f)
        curveTo(22f, 4.34315f, 22f, 6.22876f, 22f, 10f)
        curveTo(22f, 13.7712f, 22f, 15.6569f, 20.8284f, 16.8284f)
        curveTo(19.6569f, 18f, 17.7712f, 18f, 14f, 18f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 18f, 4.34315f, 18f, 3.17157f, 16.8284f)
        curveTo(2f, 15.6569f, 2f, 13.7712f, 2f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 22f)
        curveTo(14.8233f, 21.364f, 13.4571f, 21f, 12f, 21f)
        curveTo(10.5429f, 21f, 9.17669f, 21.364f, 8f, 22f)
        }
        }.build()

        return _modernTv!!
    }

private var _modernTv: ImageVector? = null
