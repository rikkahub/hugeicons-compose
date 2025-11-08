package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SolarEnergy: ImageVector
    get() {
        if (_solarEnergy != null) {
            return _solarEnergy!!
        }
        _solarEnergy = ImageVector.Builder(
            name = "SolarEnergy",
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
        curveTo(2.77968f, 6.18409f, 5.66918f, 3.12932f, 9.40618f, 2.08977f)
        curveTo(9.71987f, 2.00251f, 9.87671f, 1.95888f, 9.96119f, 2.05236f)
        curveTo(10.0457f, 2.14584f, 9.98344f, 2.30042f, 9.85897f, 2.60956f)
        lineTo(9f, 4.5f)
        moveTo(14f, 2f)
        curveTo(17.8159f, 2.77968f, 20.8707f, 5.66918f, 21.9102f, 9.40618f)
        curveTo(21.9975f, 9.71987f, 22.0411f, 9.87671f, 21.9476f, 9.96119f)
        curveTo(21.8542f, 10.0457f, 21.6996f, 9.98344f, 21.3904f, 9.85897f)
        lineTo(19.5f, 9f)
        moveTo(22f, 14f)
        curveTo(21.2203f, 17.8159f, 18.3308f, 20.8707f, 14.5938f, 21.9102f)
        curveTo(14.2801f, 21.9975f, 14.1233f, 22.0411f, 14.0388f, 21.9476f)
        curveTo(13.9543f, 21.8542f, 14.0166f, 21.6996f, 14.141f, 21.3904f)
        lineTo(15f, 19.5f)
        moveTo(10f, 22f)
        curveTo(6.18409f, 21.2203f, 3.12932f, 18.3308f, 2.08977f, 14.5938f)
        curveTo(2.00251f, 14.2801f, 1.95888f, 14.1233f, 2.05236f, 14.0388f)
        curveTo(2.14584f, 13.9543f, 2.30042f, 14.0166f, 2.60956f, 14.141f)
        lineTo(4.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        curveTo(15f, 13.6569f, 13.6569f, 15f, 12f, 15f)
        moveTo(15f, 12f)
        curveTo(15f, 10.3431f, 13.6569f, 9f, 12f, 9f)
        moveTo(15f, 12f)
        horizontalLineTo(16.5f)
        moveTo(12f, 15f)
        curveTo(10.3431f, 15f, 9f, 13.6569f, 9f, 12f)
        moveTo(12f, 15f)
        verticalLineTo(16.5f)
        moveTo(9f, 12f)
        curveTo(9f, 10.3431f, 10.3431f, 9f, 12f, 9f)
        moveTo(9f, 12f)
        lineTo(7.5f, 12f)
        moveTo(12f, 9f)
        verticalLineTo(7.5f)
        moveTo(14.1213f, 9.87869f)
        lineTo(15.182f, 8.81803f)
        moveTo(9.87868f, 14.1213f)
        lineTo(8.81802f, 15.182f)
        moveTo(14.1213f, 14.1213f)
        lineTo(15.182f, 15.182f)
        moveTo(9.87868f, 9.87869f)
        lineTo(8.81802f, 8.81803f)
        }
        }.build()

        return _solarEnergy!!
    }

private var _solarEnergy: ImageVector? = null
