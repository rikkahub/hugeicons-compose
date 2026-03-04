package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kaaba01: ImageVector
    get() {
        if (_kaaba01 != null) {
            return _kaaba01!!
        }
        _kaaba01 = ImageVector.Builder(
            name = "Kaaba01",
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
        moveTo(3f, 22f)
        verticalLineTo(5.9907f)
        curveTo(3f, 5.25783f, 3f, 4.8914f, 3.20387f, 4.62261f)
        curveTo(3.40774f, 4.35383f, 3.76006f, 4.25575f, 4.46471f, 4.0596f)
        lineTo(11.4647f, 2.11106f)
        curveTo(11.7307f, 2.03702f, 11.8637f, 2f, 12f, 2f)
        curveTo(12.1363f, 2f, 12.2693f, 2.03702f, 12.5353f, 2.11106f)
        lineTo(19.5353f, 4.0596f)
        curveTo(20.2399f, 4.25575f, 20.5923f, 4.35383f, 20.7961f, 4.62261f)
        curveTo(21f, 4.8914f, 21f, 5.25783f, 21f, 5.9907f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9f)
        lineTo(11.5661f, 7.04882f)
        curveTo(11.8519f, 6.98373f, 12.1481f, 6.98373f, 12.4339f, 7.04882f)
        lineTo(21f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.65f, 12.7f)
        lineTo(21f, 13f)
        moveTo(15.6f, 11.8f)
        lineTo(16.5f, 12f)
        moveTo(12.9f, 11.2f)
        lineTo(12f, 11f)
        lineTo(11.1f, 11.2f)
        moveTo(4.35f, 12.7f)
        lineTo(3f, 13f)
        moveTo(8.4f, 11.8f)
        lineTo(7.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(22f)
        }
        }.build()

        return _kaaba01!!
    }

private var _kaaba01: ImageVector? = null
