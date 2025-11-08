package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Zoom: ImageVector
    get() {
        if (_zoom != null) {
            return _zoom!!
        }
        _zoom = ImageVector.Builder(
            name = "Zoom",
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
        verticalLineTo(8f)
        curveTo(2f, 7.05719f, 2f, 6.58579f, 2.29289f, 6.29289f)
        curveTo(2.58579f, 6f, 3.05719f, 6f, 4f, 6f)
        horizontalLineTo(7f)
        curveTo(10.7712f, 6f, 12.6569f, 6f, 13.8284f, 7.17157f)
        curveTo(15f, 8.34315f, 15f, 10.2288f, 15f, 14f)
        verticalLineTo(16f)
        curveTo(15f, 16.9428f, 15f, 17.4142f, 14.7071f, 17.7071f)
        curveTo(14.4142f, 18f, 13.9428f, 18f, 13f, 18f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 18f, 4.34315f, 18f, 3.17157f, 16.8284f)
        curveTo(2f, 15.6569f, 2f, 13.7712f, 2f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.8995f, 9.07049f)
        lineTo(18.5997f, 8.39526f)
        curveTo(20.0495f, 6.99707f, 20.7744f, 6.29798f, 21.3872f, 6.55106f)
        curveTo(22f, 6.80414f, 22f, 7.80262f, 22f, 9.79956f)
        verticalLineTo(14.2004f)
        curveTo(22f, 16.1974f, 22f, 17.1959f, 21.3872f, 17.4489f)
        curveTo(20.7744f, 17.702f, 20.0495f, 17.0029f, 18.5997f, 15.6047f)
        lineTo(17.8995f, 14.9295f)
        curveTo(17.0122f, 14.0738f, 17f, 14.0453f, 17f, 12.8231f)
        verticalLineTo(11.1769f)
        curveTo(17f, 9.95473f, 17.0122f, 9.92624f, 17.8995f, 9.07049f)
        }
        }.build()

        return _zoom!!
    }

private var _zoom: ImageVector? = null
