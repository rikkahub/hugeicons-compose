package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.QrCodeScan: ImageVector
    get() {
        if (_qrCodeScan != null) {
            return _qrCodeScan!!
        }
        _qrCodeScan = ImageVector.Builder(
            name = "QrCodeScan",
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
        moveTo(8.23463f, 12.8478f)
        curveTo(8.60218f, 13f, 9.06812f, 13f, 10f, 13f)
        curveTo(10.9319f, 13f, 11.3978f, 13f, 11.7654f, 12.8478f)
        curveTo(12.2554f, 12.6448f, 12.6448f, 12.2554f, 12.8478f, 11.7654f)
        curveTo(13f, 11.3978f, 13f, 10.9319f, 13f, 10f)
        curveTo(13f, 9.06812f, 13f, 8.60218f, 12.8478f, 8.23463f)
        curveTo(12.6448f, 7.74458f, 12.2554f, 7.35523f, 11.7654f, 7.15224f)
        curveTo(11.3978f, 7f, 10.9319f, 7f, 10f, 7f)
        curveTo(9.06812f, 7f, 8.60218f, 7f, 8.23463f, 7.15224f)
        curveTo(7.74458f, 7.35523f, 7.35523f, 7.74458f, 7.15224f, 8.23463f)
        curveTo(7f, 8.60218f, 7f, 9.06812f, 7f, 10f)
        curveTo(7f, 10.9319f, 7f, 11.3978f, 7.15224f, 11.7654f)
        curveTo(7.35523f, 12.2554f, 7.74458f, 12.6448f, 8.23463f, 12.8478f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 7f)
        verticalLineTo(7.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 11f)
        verticalLineTo(13f)
        curveTo(17f, 14.8856f, 17f, 15.8284f, 16.4142f, 16.4142f)
        curveTo(15.8284f, 17f, 14.8856f, 17f, 13f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 17f)
        horizontalLineTo(7f)
        }
        }.build()

        return _qrCodeScan!!
    }

private var _qrCodeScan: ImageVector? = null
