package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.XVariable: ImageVector
    get() {
        if (_xVariable != null) {
            return _xVariable!!
        }
        _xVariable = ImageVector.Builder(
            name = "XVariable",
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
        moveTo(20f, 3.5f)
        curveTo(13.6327f, 3.5f, 10.3673f, 20.5f, 4f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 20.5f)
        curveTo(17.3824f, 20.5f, 16.5736f, 20.5f, 15.8917f, 20.1583f)
        curveTo(15.5045f, 19.9641f, 15.1519f, 19.6927f, 14.8512f, 19.3572f)
        curveTo(14.3219f, 18.7666f, 14.0315f, 17.9204f, 13.4508f, 16.2281f)
        lineTo(10.5492f, 7.77185f)
        curveTo(9.96847f, 6.07955f, 9.67813f, 5.2334f, 9.14881f, 4.64277f)
        curveTo(8.84813f, 4.30728f, 8.49555f, 4.03585f, 8.10825f, 3.84174f)
        curveTo(7.42642f, 3.5f, 6.61762f, 3.5f, 5f, 3.5f)
        }
        }.build()

        return _xVariable!!
    }

private var _xVariable: ImageVector? = null
