package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BarcodeScan: ImageVector
    get() {
        if (_barcodeScan != null) {
            return _barcodeScan!!
        }
        _barcodeScan = ImageVector.Builder(
            name = "BarcodeScan",
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
        moveTo(2.5f, 8.18677f)
        curveTo(2.60406f, 6.08705f, 2.91537f, 4.77792f, 3.84664f, 3.84664f)
        curveTo(4.77792f, 2.91537f, 6.08705f, 2.60406f, 8.18677f, 2.5f)
        moveTo(21.5f, 8.18677f)
        curveTo(21.3959f, 6.08705f, 21.0846f, 4.77792f, 20.1534f, 3.84664f)
        curveTo(19.2221f, 2.91537f, 17.9129f, 2.60406f, 15.8132f, 2.5f)
        moveTo(15.8132f, 21.5f)
        curveTo(17.9129f, 21.3959f, 19.2221f, 21.0846f, 20.1534f, 20.1534f)
        curveTo(21.0846f, 19.2221f, 21.3959f, 17.9129f, 21.5f, 15.8132f)
        moveTo(8.18676f, 21.5f)
        curveTo(6.08705f, 21.3959f, 4.77792f, 21.0846f, 3.84664f, 20.1534f)
        curveTo(2.91537f, 19.2221f, 2.60406f, 17.9129f, 2.5f, 15.8132f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 7f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        verticalLineTo(17.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7f)
        verticalLineTo(17f)
        }
        }.build()

        return _barcodeScan!!
    }

private var _barcodeScan: ImageVector? = null
