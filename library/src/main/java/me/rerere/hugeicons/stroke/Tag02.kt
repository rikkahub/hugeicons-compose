package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tag02: ImageVector
    get() {
        if (_tag02 != null) {
            return _tag02!!
        }
        _tag02 = ImageVector.Builder(
            name = "Tag02",
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
        moveTo(2.73552f, 11.6867f)
        curveTo(1.78253f, 12.7511f, 1.76203f, 14.3569f, 2.63665f, 15.4865f)
        curveTo(4.37226f, 17.7281f, 6.2719f, 19.6277f, 8.51351f, 21.3633f)
        curveTo(9.64313f, 22.238f, 11.2489f, 22.2175f, 12.3133f, 21.2645f)
        curveTo(15.203f, 18.6771f, 17.8494f, 15.9731f, 20.4033f, 13.0016f)
        curveTo(20.6558f, 12.7078f, 20.8137f, 12.3477f, 20.8492f, 11.9619f)
        curveTo(21.0059f, 10.2561f, 21.3279f, 5.34144f, 19.9932f, 4.00675f)
        curveTo(18.6586f, 2.67207f, 13.7439f, 2.99408f, 12.0381f, 3.15083f)
        curveTo(11.6523f, 3.18627f, 11.2922f, 3.34421f, 10.9984f, 3.59671f)
        curveTo(8.02692f, 6.15064f, 5.32291f, 8.797f, 2.73552f, 11.6867f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 14.5f)
        lineTo(9.5f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 6f)
        lineTo(22f, 2f)
        }
        }.build()

        return _tag02!!
    }

private var _tag02: ImageVector? = null
