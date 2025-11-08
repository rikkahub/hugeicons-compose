package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TokenSquare: ImageVector
    get() {
        if (_tokenSquare != null) {
            return _tokenSquare!!
        }
        _tokenSquare = ImageVector.Builder(
            name = "TokenSquare",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.77027f, 2.5f, 5.6554f, 3.69797f, 4.25276f)
        curveTo(3.86808f, 4.05358f, 4.05358f, 3.86808f, 4.25276f, 3.69797f)
        curveTo(5.6554f, 2.5f, 7.77027f, 2.5f, 12f, 2.5f)
        curveTo(16.2297f, 2.5f, 18.3446f, 2.5f, 19.7472f, 3.69797f)
        curveTo(19.9464f, 3.86808f, 20.1319f, 4.05358f, 20.302f, 4.25276f)
        curveTo(21.5f, 5.6554f, 21.5f, 7.77027f, 21.5f, 12f)
        curveTo(21.5f, 16.2297f, 21.5f, 18.3446f, 20.302f, 19.7472f)
        curveTo(20.1319f, 19.9464f, 19.9464f, 20.1319f, 19.7472f, 20.302f)
        curveTo(18.3446f, 21.5f, 16.2297f, 21.5f, 12f, 21.5f)
        curveTo(7.77027f, 21.5f, 5.6554f, 21.5f, 4.25276f, 20.302f)
        curveTo(4.05358f, 20.1319f, 3.86808f, 19.9464f, 3.69797f, 19.7472f)
        curveTo(2.5f, 18.3446f, 2.5f, 16.2297f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5384f, 7.2534f)
        curveTo(11.7534f, 6.91553f, 12.2466f, 6.91553f, 12.4616f, 7.2534f)
        lineTo(13.0837f, 8.23082f)
        curveTo(13.7716f, 9.3117f, 14.6883f, 10.2284f, 15.7692f, 10.9163f)
        lineTo(16.7466f, 11.5384f)
        curveTo(17.0845f, 11.7534f, 17.0845f, 12.2466f, 16.7466f, 12.4616f)
        lineTo(15.7692f, 13.0837f)
        curveTo(14.6883f, 13.7716f, 13.7716f, 14.6883f, 13.0837f, 15.7692f)
        lineTo(12.4616f, 16.7466f)
        curveTo(12.2466f, 17.0845f, 11.7534f, 17.0845f, 11.5384f, 16.7466f)
        lineTo(10.9163f, 15.7692f)
        curveTo(10.2284f, 14.6883f, 9.3117f, 13.7716f, 8.23082f, 13.0837f)
        lineTo(7.2534f, 12.4616f)
        curveTo(6.91553f, 12.2466f, 6.91553f, 11.7534f, 7.2534f, 11.5384f)
        lineTo(8.23082f, 10.9163f)
        curveTo(9.3117f, 10.2284f, 10.2284f, 9.3117f, 10.9163f, 8.23082f)
        lineTo(11.5384f, 7.2534f)
        }
        }.build()

        return _tokenSquare!!
    }

private var _tokenSquare: ImageVector? = null
