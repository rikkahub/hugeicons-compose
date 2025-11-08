package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = ImageVector.Builder(
            name = "Telegram",
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
        moveTo(11.9854f, 15.4083f)
        lineTo(15.2268f, 19.0936f)
        curveTo(16.4277f, 20.4589f, 17.0282f, 21.1416f, 17.6567f, 20.9754f)
        curveTo(18.2852f, 20.8092f, 18.5008f, 19.9108f, 18.9318f, 18.1138f)
        lineTo(21.3229f, 8.1459f)
        curveTo(21.9868f, 5.37832f, 22.3187f, 3.99454f, 21.5808f, 3.312f)
        curveTo(20.843f, 2.62947f, 19.564f, 3.13725f, 17.0061f, 4.15282f)
        lineTo(5.13876f, 8.86449f)
        curveTo(3.09293f, 9.67674f, 2.07001f, 10.0829f, 2.00507f, 10.7808f)
        curveTo(1.99842f, 10.8522f, 1.99831f, 10.9241f, 2.00474f, 10.9955f)
        curveTo(2.06754f, 11.6937f, 3.08921f, 12.1033f, 5.13255f, 12.9223f)
        curveTo(6.05838f, 13.2934f, 6.5213f, 13.479f, 6.8532f, 13.8344f)
        curveTo(6.89052f, 13.8743f, 6.9264f, 13.9157f, 6.96078f, 13.9584f)
        curveTo(7.26658f, 14.3384f, 7.39709f, 14.8371f, 7.65808f, 15.8344f)
        lineTo(8.14653f, 17.701f)
        curveTo(8.4005f, 18.6715f, 8.52749f, 19.1568f, 8.86008f, 19.223f)
        curveTo(9.19267f, 19.2891f, 9.48225f, 18.8867f, 10.0614f, 18.0819f)
        lineTo(11.9854f, 15.4083f)
        moveTo(11.9854f, 15.4083f)
        lineTo(11.6676f, 15.0771f)
        curveTo(11.3059f, 14.7001f, 11.1251f, 14.5117f, 11.1251f, 14.2775f)
        curveTo(11.1251f, 14.0433f, 11.3059f, 13.8548f, 11.6676f, 13.4778f)
        lineTo(15.2406f, 9.75409f)
        }
        }.build()

        return _telegram!!
    }

private var _telegram: ImageVector? = null
