package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PackageReceive: ImageVector
    get() {
        if (_packageReceive != null) {
            return _packageReceive!!
        }
        _packageReceive = ImageVector.Builder(
            name = "PackageReceive",
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
        moveTo(12f, 22f)
        curveTo(11.1818f, 22f, 10.4002f, 21.6754f, 8.83693f, 21.0262f)
        curveTo(4.94564f, 19.4101f, 3f, 18.6021f, 3f, 17.2429f)
        verticalLineTo(7.74463f)
        moveTo(12f, 22f)
        curveTo(12.8182f, 22f, 13.5998f, 21.6754f, 15.1631f, 21.0262f)
        curveTo(19.0544f, 19.4101f, 21f, 18.6021f, 21f, 17.2429f)
        verticalLineTo(7.74463f)
        moveTo(12f, 22f)
        verticalLineTo(12.1687f)
        moveTo(3f, 7.74463f)
        curveTo(3f, 8.3485f, 3.80157f, 8.72983f, 5.40472f, 9.49248f)
        lineTo(8.32592f, 10.8822f)
        curveTo(10.1288f, 11.7399f, 11.0303f, 12.1687f, 12f, 12.1687f)
        moveTo(3f, 7.74463f)
        curveTo(3f, 7.14076f, 3.80157f, 6.75944f, 5.40472f, 5.99678f)
        lineTo(7.5f, 5f)
        moveTo(21f, 7.74463f)
        curveTo(21f, 8.3485f, 20.1984f, 8.72983f, 18.5953f, 9.49248f)
        lineTo(15.6741f, 10.8822f)
        curveTo(13.8712f, 11.7399f, 12.9697f, 12.1687f, 12f, 12.1687f)
        moveTo(21f, 7.74463f)
        curveTo(21f, 7.14076f, 20.1984f, 6.75944f, 18.5953f, 5.99678f)
        lineTo(16.5f, 5f)
        moveTo(6f, 13.1518f)
        lineTo(8f, 14.135f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0037f, 2f)
        lineTo(12.0037f, 8.99995f)
        moveTo(12.0037f, 8.99995f)
        curveTo(12.2668f, 9.00351f, 12.5263f, 8.81972f, 12.7178f, 8.59534f)
        lineTo(14f, 7.06174f)
        moveTo(12.0037f, 8.99995f)
        curveTo(11.7499f, 8.99652f, 11.4929f, 8.81368f, 11.2897f, 8.59534f)
        lineTo(10f, 7.06174f)
        }
        }.build()

        return _packageReceive!!
    }

private var _packageReceive: ImageVector? = null
