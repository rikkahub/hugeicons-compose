package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mask: ImageVector
    get() {
        if (_mask != null) {
            return _mask!!
        }
        _mask = ImageVector.Builder(
            name = "Mask",
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
        moveTo(6f, 9f)
        curveTo(7.46589f, 8.38677f, 9.61061f, 8f, 12f, 8f)
        curveTo(14.3894f, 8f, 16.5341f, 8.38677f, 18f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 11.5f)
        curveTo(9.93974f, 11.176f, 10.9492f, 11f, 12f, 11f)
        curveTo(13.0508f, 11f, 14.0603f, 11.176f, 15f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        curveTo(9.17669f, 15.636f, 10.5429f, 16f, 12f, 16f)
        curveTo(13.4571f, 16f, 14.8233f, 15.636f, 16f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 10f)
        curveTo(6f, 13.2571f, 4.1688f, 14.9419f, 3.05731f, 14.9985f)
        curveTo(3.02153f, 15.0003f, 2.98891f, 14.9808f, 2.97139f, 14.9496f)
        curveTo(2.15656f, 13.4966f, 2f, 11.7879f, 2f, 10f)
        curveTo(2f, 6.68629f, 2.89543f, 4f, 4f, 4f)
        curveTo(5.10457f, 4f, 6f, 6.68629f, 6f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 10f)
        curveTo(18f, 13.2571f, 19.8312f, 14.9419f, 20.9427f, 14.9985f)
        curveTo(20.9785f, 15.0003f, 21.0111f, 14.9808f, 21.0286f, 14.9496f)
        curveTo(21.8434f, 13.4966f, 22f, 11.7879f, 22f, 10f)
        curveTo(22f, 6.68629f, 21.1046f, 4f, 20f, 4f)
        curveTo(18.8954f, 4f, 18f, 6.68629f, 18f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 15f)
        curveTo(19.2035f, 17.989f, 15.8458f, 20f, 12f, 20f)
        curveTo(8.15423f, 20f, 4.79648f, 17.989f, 3f, 15f)
        }
        }.build()

        return _mask!!
    }

private var _mask: ImageVector? = null
