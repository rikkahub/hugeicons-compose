package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Duplex: ImageVector
    get() {
        if (_duplex != null) {
            return _duplex!!
        }
        _duplex = ImageVector.Builder(
            name = "Duplex",
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
        moveTo(18.5f, 6f)
        lineTo(12.916f, 2.27735f)
        curveTo(12.6448f, 2.0965f, 12.326f, 2f, 12f, 2f)
        curveTo(11.674f, 2f, 11.3552f, 2.0965f, 11.084f, 2.27735f)
        lineTo(5.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 14f)
        lineTo(12.916f, 9.27735f)
        curveTo(12.6448f, 9.0965f, 12.326f, 9f, 12f, 9f)
        curveTo(11.674f, 9f, 11.3552f, 9.0965f, 11.084f, 9.27735f)
        lineTo(4f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 13.5f)
        verticalLineTo(18f)
        curveTo(18.5f, 19.8856f, 18.5f, 20.8284f, 17.9142f, 21.4142f)
        curveTo(17.3284f, 22f, 16.3856f, 22f, 14.5f, 22f)
        horizontalLineTo(9.5f)
        curveTo(7.61438f, 22f, 6.67157f, 22f, 6.08579f, 21.4142f)
        curveTo(5.5f, 20.8284f, 5.5f, 19.8856f, 5.5f, 18f)
        verticalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 5f)
        verticalLineTo(12f)
        moveTo(7f, 5f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 22f)
        verticalLineTo(18f)
        curveTo(14f, 16.8954f, 13.1046f, 16f, 12f, 16f)
        curveTo(10.8954f, 16f, 10f, 16.8954f, 10f, 18f)
        verticalLineTo(22f)
        }
        }.build()

        return _duplex!!
    }

private var _duplex: ImageVector? = null
