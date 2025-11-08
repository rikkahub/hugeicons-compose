package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Moon02: ImageVector
    get() {
        if (_moon02 != null) {
            return _moon02!!
        }
        _moon02 = ImageVector.Builder(
            name = "Moon02",
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
        moveTo(21.5f, 14.0784f)
        curveTo(20.3003f, 14.7189f, 18.9301f, 15.0821f, 17.4751f, 15.0821f)
        curveTo(12.7491f, 15.0821f, 8.91792f, 11.2509f, 8.91792f, 6.52485f)
        curveTo(8.91792f, 5.06986f, 9.28105f, 3.69968f, 9.92163f, 2.5f)
        curveTo(5.66765f, 3.49698f, 2.5f, 7.31513f, 2.5f, 11.8731f)
        curveTo(2.5f, 17.1899f, 6.8101f, 21.5f, 12.1269f, 21.5f)
        curveTo(16.6849f, 21.5f, 20.503f, 18.3324f, 21.5f, 14.0784f)
        }
        }.build()

        return _moon02!!
    }

private var _moon02: ImageVector? = null
