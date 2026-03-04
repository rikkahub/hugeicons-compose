package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AccountRecovery: ImageVector
    get() {
        if (_accountRecovery != null) {
            return _accountRecovery!!
        }
        _accountRecovery = ImageVector.Builder(
            name = "AccountRecovery",
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
        moveTo(3.50037f, 20.3438f)
        horizontalLineTo(6.48496f)
        verticalLineTo(17.5f)
        moveTo(17.5158f, 6.5f)
        verticalLineTo(3.65617f)
        lineTo(20.5004f, 3.5f)
        moveTo(15.0004f, 2.45846f)
        curveTo(11.5611f, 1.38029f, 7.65445f, 2.20378f, 4.9293f, 4.92893f)
        curveTo(1.02406f, 8.83418f, 1.02406f, 15.1658f, 4.9293f, 19.0711f)
        curveTo(5.26839f, 19.4102f, 5.62577f, 19.7198f, 5.99826f, 20f)
        moveTo(9.00037f, 21.5415f)
        curveTo(12.4396f, 22.6197f, 16.3463f, 21.7962f, 19.0714f, 19.0711f)
        curveTo(22.9767f, 15.1658f, 22.9767f, 8.83417f, 19.0714f, 4.92893f)
        curveTo(18.7323f, 4.58984f, 18.375f, 4.2802f, 18.0025f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0002f, 11.5005f)
        curveTo(13.381f, 11.5005f, 14.5002f, 10.3812f, 14.5002f, 9.00049f)
        curveTo(14.5002f, 7.61978f, 13.381f, 6.50049f, 12.0002f, 6.50049f)
        curveTo(10.6195f, 6.50049f, 9.50024f, 7.61978f, 9.50024f, 9.00049f)
        curveTo(9.50024f, 10.3812f, 10.6195f, 11.5005f, 12.0002f, 11.5005f)
        moveTo(12.0002f, 11.5005f)
        curveTo(9.79111f, 11.5005f, 8.00024f, 13.2913f, 8.00024f, 15.5005f)
        moveTo(12.0002f, 11.5005f)
        curveTo(14.2094f, 11.5005f, 16.0002f, 13.2913f, 16.0002f, 15.5005f)
        }
        }.build()

        return _accountRecovery!!
    }

private var _accountRecovery: ImageVector? = null
