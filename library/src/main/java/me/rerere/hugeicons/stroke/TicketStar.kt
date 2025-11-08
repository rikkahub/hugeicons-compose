package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TicketStar: ImageVector
    get() {
        if (_ticketStar != null) {
            return _ticketStar!!
        }
        _ticketStar = ImageVector.Builder(
            name = "TicketStar",
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
        moveTo(15.0183f, 9.43335f)
        lineTo(15.5462f, 10.498f)
        curveTo(15.6182f, 10.6462f, 15.8102f, 10.7883f, 15.9722f, 10.8155f)
        lineTo(16.9291f, 10.9758f)
        curveTo(17.541f, 11.0787f, 17.685f, 11.5263f, 17.244f, 11.9678f)
        lineTo(16.5001f, 12.7179f)
        curveTo(16.3741f, 12.8449f, 16.3051f, 13.0899f, 16.3441f, 13.2653f)
        lineTo(16.5571f, 14.1938f)
        curveTo(16.7251f, 14.9288f, 16.3381f, 15.2131f, 15.6932f, 14.829f)
        lineTo(14.7963f, 14.2937f)
        curveTo(14.6343f, 14.1969f, 14.3674f, 14.1969f, 14.2024f, 14.2937f)
        lineTo(13.3055f, 14.829f)
        curveTo(12.6636f, 15.2131f, 12.2736f, 14.9258f, 12.4416f, 14.1938f)
        lineTo(12.6546f, 13.2653f)
        curveTo(12.6935f, 13.0899f, 12.6246f, 12.8449f, 12.4986f, 12.7179f)
        lineTo(11.7547f, 11.9678f)
        curveTo(11.3167f, 11.5263f, 11.4577f, 11.0787f, 12.0696f, 10.9758f)
        lineTo(13.0265f, 10.8155f)
        curveTo(13.1855f, 10.7883f, 13.3775f, 10.6462f, 13.4495f, 10.498f)
        lineTo(13.9774f, 9.43335f)
        curveTo(14.2654f, 8.85568f, 14.7333f, 8.85568f, 15.0183f, 9.43335f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        lineTo(8f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 3.5f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 8.87895f)
        curveTo(21.9331f, 7.33687f, 21.7456f, 6.33298f, 21.2203f, 5.53884f)
        curveTo(20.9181f, 5.08196f, 20.5428f, 4.68459f, 20.1112f, 4.36468f)
        curveTo(18.9447f, 3.5f, 17.299f, 3.5f, 14.0078f, 3.5f)
        horizontalLineTo(9.99305f)
        curveTo(6.70178f, 3.5f, 5.05614f, 3.5f, 3.88962f, 4.36468f)
        curveTo(3.45805f, 4.68459f, 3.08267f, 5.08196f, 2.78047f, 5.53884f)
        curveTo(2.25526f, 6.33289f, 2.06776f, 7.33665f, 2.00083f, 8.87843f)
        curveTo(1.98938f, 9.14208f, 2.21648f, 9.34375f, 2.46531f, 9.34375f)
        curveTo(3.85109f, 9.34375f, 4.97449f, 10.533f, 4.97449f, 12f)
        curveTo(4.97449f, 13.467f, 3.85109f, 14.6562f, 2.46531f, 14.6562f)
        curveTo(2.21648f, 14.6562f, 1.98938f, 14.8579f, 2.00083f, 15.1216f)
        curveTo(2.06776f, 16.6634f, 2.25526f, 17.6671f, 2.78047f, 18.4612f)
        curveTo(3.08267f, 18.918f, 3.45805f, 19.3154f, 3.88962f, 19.6353f)
        curveTo(5.05614f, 20.5f, 6.70178f, 20.5f, 9.99306f, 20.5f)
        horizontalLineTo(14.0078f)
        curveTo(17.299f, 20.5f, 18.9447f, 20.5f, 20.1112f, 19.6353f)
        curveTo(20.5428f, 19.3154f, 20.9181f, 18.918f, 21.2203f, 18.4612f)
        curveTo(21.7456f, 17.667f, 21.9331f, 16.6631f, 22f, 15.1211f)
        verticalLineTo(8.87895f)
        }
        }.build()

        return _ticketStar!!
    }

private var _ticketStar: ImageVector? = null
