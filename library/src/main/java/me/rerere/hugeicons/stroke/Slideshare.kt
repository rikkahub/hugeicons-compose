package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Slideshare: ImageVector
    get() {
        if (_slideshare != null) {
            return _slideshare!!
        }
        _slideshare = ImageVector.Builder(
            name = "Slideshare",
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
        moveTo(22f, 11.0369f)
        curveTo(21.191f, 11.8592f, 19.4261f, 13.0863f, 17.066f, 14.0392f)
        moveTo(17.066f, 14.0392f)
        curveTo(16.5256f, 14.2574f, 15.9514f, 14.4596f, 15.3467f, 14.6368f)
        curveTo(14.5936f, 14.9002f, 13.03f, 15.8088f, 13.0875f, 17.8138f)
        lineTo(13.0221f, 20.9633f)
        curveTo(13.022f, 21.3093f, 13.4374f, 21.8607f, 14.2334f, 21.974f)
        curveTo(15.2152f, 22.1137f, 16.6684f, 21.6963f, 17.3353f, 20.8446f)
        curveTo(18.3306f, 19.5735f, 18.2778f, 16.5769f, 17.066f, 14.0392f)
        moveTo(2f, 11.0053f)
        curveTo(2.80901f, 11.8275f, 4.52622f, 13.0863f, 6.88627f, 14.0392f)
        moveTo(6.88627f, 14.0392f)
        curveTo(7.42672f, 14.2574f, 8.00089f, 14.4596f, 8.60558f, 14.6368f)
        curveTo(9.95196f, 15.0314f, 10.9358f, 16.1965f, 10.9897f, 17.6962f)
        curveTo(11.0436f, 19.1958f, 11.1109f, 20.0516f, 10.8648f, 20.4543f)
        curveTo(10.6186f, 20.8569f, 10.0401f, 21.0237f, 9.3936f, 21.0582f)
        curveTo(8.74709f, 21.0927f, 7.37332f, 20.7422f, 6.70646f, 19.8906f)
        curveTo(5.71115f, 18.6194f, 5.67453f, 16.5769f, 6.88627f, 14.0392f)
        moveTo(9.9755f, 10.4995f)
        curveTo(9.9755f, 11.3279f, 9.30153f, 11.9995f, 8.47015f, 11.9995f)
        curveTo(7.63877f, 11.9995f, 6.96481f, 11.3279f, 6.96481f, 10.4995f)
        curveTo(6.96481f, 9.67108f, 7.63877f, 8.99951f, 8.47015f, 8.99951f)
        curveTo(9.30153f, 8.99951f, 9.9755f, 9.67108f, 9.9755f, 10.4995f)
        moveTo(17.0004f, 10.4995f)
        curveTo(17.0004f, 11.3279f, 16.3265f, 11.9995f, 15.4951f, 11.9995f)
        curveTo(14.6637f, 11.9995f, 13.9897f, 11.3279f, 13.9897f, 10.4995f)
        curveTo(13.9897f, 9.67108f, 14.6637f, 8.99951f, 15.4951f, 8.99951f)
        curveTo(16.3265f, 8.99951f, 17.0004f, 9.67108f, 17.0004f, 10.4995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.0093f, 8.99951f)
        curveTo(20.0001f, 5.88521f, 19.9014f, 4.23418f, 18.8345f, 3.17108f)
        curveTo(17.6587f, 1.99951f, 15.7664f, 1.99951f, 11.9818f, 1.99951f)
        curveTo(8.19706f, 1.99951f, 6.30473f, 1.99951f, 5.12897f, 3.17108f)
        curveTo(4.0621f, 4.23418f, 3.96331f, 5.88521f, 3.95416f, 8.99951f)
        }
        }.build()

        return _slideshare!!
    }

private var _slideshare: ImageVector? = null
