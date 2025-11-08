package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TabletConnectedUsb: ImageVector
    get() {
        if (_tabletConnectedUsb != null) {
            return _tabletConnectedUsb!!
        }
        _tabletConnectedUsb = ImageVector.Builder(
            name = "TabletConnectedUsb",
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
        moveTo(22f, 18f)
        curveTo(21.8011f, 18.6891f, 21.4991f, 19.2323f, 21.0408f, 19.682f)
        curveTo(19.6974f, 21f, 17.5354f, 21f, 13.2113f, 21f)
        horizontalLineTo(11.1729f)
        curveTo(6.8487f, 21f, 4.68664f, 21f, 3.3433f, 19.682f)
        curveTo(1.99997f, 18.364f, 1.99997f, 16.2426f, 1.99997f, 12f)
        curveTo(1.99997f, 7.75736f, 1.99997f, 5.63604f, 3.3433f, 4.31802f)
        curveTo(4.68664f, 3f, 6.8487f, 3f, 11.1729f, 3f)
        horizontalLineTo(13.2113f)
        curveTo(17.5354f, 3f, 19.6974f, 3f, 21.0408f, 4.31802f)
        curveTo(21.4991f, 4.76771f, 21.8011f, 5.31092f, 22f, 5.99999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.49997f, 3.5f)
        verticalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.6234f, 12.0023f)
        curveTo(19.6234f, 12.6584f, 20.1553f, 13.1903f, 20.8115f, 13.1903f)
        curveTo(21.4676f, 13.1903f, 21.9995f, 12.6584f, 21.9995f, 12.0023f)
        curveTo(21.9995f, 11.3461f, 21.4676f, 10.8142f, 20.8115f, 10.8142f)
        curveTo(20.1553f, 10.8142f, 19.6234f, 11.3461f, 19.6234f, 12.0023f)
        moveTo(19.6234f, 12.0023f)
        lineTo(10.0254f, 12.0062f)
        moveTo(12.3849f, 8.52051f)
        lineTo(13.5067f, 8.56407f)
        curveTo(13.9096f, 8.57972f, 14.2637f, 8.83585f, 14.4047f, 9.21364f)
        lineTo(15.4367f, 12.004f)
        moveTo(14.194f, 15.4923f)
        lineTo(15.3157f, 15.4487f)
        curveTo(15.7186f, 15.4331f, 16.0728f, 15.1769f, 16.2138f, 14.7991f)
        lineTo(17.2312f, 12.0032f)
        }
        }.build()

        return _tabletConnectedUsb!!
    }

private var _tabletConnectedUsb: ImageVector? = null
