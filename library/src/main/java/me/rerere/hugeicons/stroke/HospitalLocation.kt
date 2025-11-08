package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HospitalLocation: ImageVector
    get() {
        if (_hospitalLocation != null) {
            return _hospitalLocation!!
        }
        _hospitalLocation = ImageVector.Builder(
            name = "HospitalLocation",
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
        moveTo(12.5f, 2f)
        curveTo(7.80558f, 2f, 4f, 5.61783f, 4f, 10.0807f)
        curveTo(4f, 12.6325f, 5.0625f, 14.6167f, 7.1875f, 16.389f)
        curveTo(8.68532f, 17.6382f, 10.4999f, 19.7131f, 11.5893f, 21.3951f)
        curveTo(12.1118f, 22.2016f, 12.8507f, 22.2016f, 13.4107f, 21.3951f)
        curveTo(14.5553f, 19.7466f, 16.3147f, 17.6382f, 17.8125f, 16.389f)
        curveTo(19.9375f, 14.6167f, 21f, 12.6325f, 21f, 10.0807f)
        curveTo(21f, 5.61783f, 17.1944f, 2f, 12.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 7f)
        verticalLineTo(10f)
        moveTo(10.5f, 13f)
        verticalLineTo(10f)
        moveTo(14.5f, 7f)
        verticalLineTo(10f)
        moveTo(14.5f, 13f)
        verticalLineTo(10f)
        moveTo(14.5f, 10f)
        horizontalLineTo(10.5f)
        }
        }.build()

        return _hospitalLocation!!
    }

private var _hospitalLocation: ImageVector? = null
