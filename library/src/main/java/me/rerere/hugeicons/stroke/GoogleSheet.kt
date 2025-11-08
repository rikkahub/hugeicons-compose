package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GoogleSheet: ImageVector
    get() {
        if (_googleSheet != null) {
            return _googleSheet!!
        }
        _googleSheet = ImageVector.Builder(
            name = "GoogleSheet",
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
        moveTo(15f, 2.5f)
        verticalLineTo(4f)
        curveTo(15f, 5.41421f, 15f, 6.12132f, 15.4393f, 6.56066f)
        curveTo(15.8787f, 7f, 16.5858f, 7f, 18f, 7f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 16f)
        verticalLineTo(8f)
        curveTo(4f, 5.17157f, 4f, 3.75736f, 4.87868f, 2.87868f)
        curveTo(5.75736f, 2f, 7.17157f, 2f, 10f, 2f)
        horizontalLineTo(14.1716f)
        curveTo(14.5803f, 2f, 14.7847f, 2f, 14.9685f, 2.07612f)
        curveTo(15.1522f, 2.15224f, 15.2968f, 2.29676f, 15.5858f, 2.58579f)
        lineTo(19.4142f, 6.41421f)
        curveTo(19.7032f, 6.70324f, 19.8478f, 6.84776f, 19.9239f, 7.03153f)
        curveTo(20f, 7.2153f, 20f, 7.41968f, 20f, 7.82843f)
        verticalLineTo(16f)
        curveTo(20f, 18.8284f, 20f, 20.2426f, 19.1213f, 21.1213f)
        curveTo(18.2426f, 22f, 16.8284f, 22f, 14f, 22f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 22f, 5.75736f, 22f, 4.87868f, 21.1213f)
        curveTo(4f, 20.2426f, 4f, 18.8284f, 4f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11f)
        verticalLineTo(14f)
        moveTo(12f, 14f)
        verticalLineTo(17f)
        moveTo(12f, 14f)
        horizontalLineTo(7.5f)
        moveTo(12f, 14f)
        horizontalLineTo(16.5f)
        moveTo(9.5f, 17f)
        horizontalLineTo(14.5f)
        curveTo(15.4428f, 17f, 15.9142f, 17f, 16.2071f, 16.7071f)
        curveTo(16.5f, 16.4142f, 16.5f, 15.9428f, 16.5f, 15f)
        verticalLineTo(13f)
        curveTo(16.5f, 12.0572f, 16.5f, 11.5858f, 16.2071f, 11.2929f)
        curveTo(15.9142f, 11f, 15.4428f, 11f, 14.5f, 11f)
        horizontalLineTo(9.5f)
        curveTo(8.55719f, 11f, 8.08579f, 11f, 7.79289f, 11.2929f)
        curveTo(7.5f, 11.5858f, 7.5f, 12.0572f, 7.5f, 13f)
        verticalLineTo(15f)
        curveTo(7.5f, 15.9428f, 7.5f, 16.4142f, 7.79289f, 16.7071f)
        curveTo(8.08579f, 17f, 8.55719f, 17f, 9.5f, 17f)
        }
        }.build()

        return _googleSheet!!
    }

private var _googleSheet: ImageVector? = null
