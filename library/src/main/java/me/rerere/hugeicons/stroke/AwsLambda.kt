package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AwsLambda: ImageVector
    get() {
        if (_awsLambda != null) {
            return _awsLambda!!
        }
        _awsLambda = ImageVector.Builder(
            name = "AwsLambda",
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
        moveTo(9f, 7f)
        horizontalLineTo(8f)
        curveTo(7.05719f, 7f, 6.58579f, 7f, 6.29289f, 6.70711f)
        curveTo(6f, 6.41421f, 6f, 5.94281f, 6f, 5f)
        curveTo(6f, 4.05719f, 6f, 3.58579f, 6.29289f, 3.29289f)
        curveTo(6.58579f, 3f, 7.05719f, 3f, 8f, 3f)
        horizontalLineTo(9.52786f)
        curveTo(10.7307f, 3f, 11.3321f, 3f, 11.8154f, 3.2987f)
        curveTo(12.2987f, 3.5974f, 12.5677f, 4.13531f, 13.1056f, 5.21115f)
        lineTo(19f, 17f)
        curveTo(19.9428f, 17f, 20.4142f, 17f, 20.7071f, 17.2929f)
        curveTo(21f, 17.5858f, 21f, 18.0572f, 21f, 19f)
        curveTo(21f, 19.9428f, 21f, 20.4142f, 20.7071f, 20.7071f)
        curveTo(20.4142f, 21f, 19.9428f, 21f, 19f, 21f)
        horizontalLineTo(18.4721f)
        curveTo(17.2693f, 21f, 16.6679f, 21f, 16.1846f, 20.7013f)
        curveTo(15.7013f, 20.4026f, 15.4323f, 19.8647f, 14.8944f, 18.7889f)
        lineTo(9f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.81966f, 21f)
        horizontalLineTo(3.7942f)
        curveTo(3.35558f, 21f, 3f, 20.6444f, 3f, 20.2058f)
        curveTo(3f, 20.0708f, 3.0344f, 19.9381f, 3.09994f, 19.8201f)
        lineTo(8f, 11f)
        lineTo(10.5f, 16f)
        lineTo(8.52786f, 19.9443f)
        curveTo(8.28351f, 20.433f, 8.16133f, 20.6773f, 7.94949f, 20.8234f)
        curveTo(7.92208f, 20.8422f, 7.89375f, 20.8598f, 7.8646f, 20.8758f)
        curveTo(7.63926f, 21f, 7.36606f, 21f, 6.81966f, 21f)
        }
        }.build()

        return _awsLambda!!
    }

private var _awsLambda: ImageVector? = null
