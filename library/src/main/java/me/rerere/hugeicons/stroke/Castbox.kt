package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Castbox: ImageVector
    get() {
        if (_castbox != null) {
            return _castbox!!
        }
        _castbox = ImageVector.Builder(
            name = "Castbox",
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
        moveTo(18.5273f, 5.54369f)
        lineTo(12.931f, 2.25342f)
        curveTo(12.6488f, 2.08749f, 12.3274f, 2f, 12f, 2f)
        curveTo(11.6726f, 2f, 11.3512f, 2.08749f, 11.069f, 2.25342f)
        lineTo(5.47268f, 5.54369f)
        curveTo(4.50957f, 6.10994f, 4.02802f, 6.39307f, 3.76401f, 6.85455f)
        curveTo(3.5f, 7.31603f, 3.5f, 7.87465f, 3.5f, 8.99188f)
        verticalLineTo(15.0081f)
        curveTo(3.5f, 16.1254f, 3.5f, 16.684f, 3.76401f, 17.1455f)
        curveTo(4.02802f, 17.6069f, 4.50957f, 17.8901f, 5.47268f, 18.4563f)
        lineTo(11.069f, 21.7466f)
        curveTo(11.3512f, 21.9125f, 11.6726f, 22f, 12f, 22f)
        curveTo(12.3274f, 22f, 12.6488f, 21.9125f, 12.931f, 21.7466f)
        lineTo(18.5273f, 18.4563f)
        curveTo(19.4904f, 17.8901f, 19.972f, 17.6069f, 20.236f, 17.1455f)
        curveTo(20.5f, 16.684f, 20.5f, 16.1254f, 20.5f, 15.0081f)
        verticalLineTo(8.99188f)
        curveTo(20.5f, 7.87465f, 20.5f, 7.31603f, 20.236f, 6.85455f)
        curveTo(19.972f, 6.39307f, 19.4904f, 6.10994f, 18.5273f, 5.54369f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 12.5f)
        verticalLineTo(13.5f)
        moveTo(15f, 11.5f)
        verticalLineTo(14f)
        moveTo(13f, 14.5f)
        verticalLineTo(10f)
        moveTo(11f, 9.5f)
        verticalLineTo(14f)
        moveTo(9f, 10.5f)
        verticalLineTo(15.5f)
        moveTo(7f, 11.5f)
        verticalLineTo(13.5f)
        moveTo(9.5f, 12f)
        horizontalLineTo(10.5f)
        moveTo(11.5f, 12.5f)
        horizontalLineTo(12.5f)
        moveTo(7.5f, 12.5f)
        horizontalLineTo(8.5f)
        }
        }.build()

        return _castbox!!
    }

private var _castbox: ImageVector? = null
