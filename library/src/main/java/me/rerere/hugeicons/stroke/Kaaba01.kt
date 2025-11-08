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
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 22f)
        verticalLineTo(5.9907f)
        curveTo(3.5f, 5.25783f, 3.5f, 4.8914f, 3.70387f, 4.62261f)
        curveTo(3.90774f, 4.35383f, 4.26006f, 4.25575f, 4.96471f, 4.0596f)
        lineTo(11.9647f, 2.11106f)
        curveTo(12.2307f, 2.03702f, 12.3637f, 2f, 12.5f, 2f)
        curveTo(12.6363f, 2f, 12.7693f, 2.03702f, 13.0353f, 2.11106f)
        lineTo(20.0353f, 4.0596f)
        curveTo(20.7399f, 4.25575f, 21.0923f, 4.35383f, 21.2961f, 4.62261f)
        curveTo(21.5f, 4.8914f, 21.5f, 5.25783f, 21.5f, 5.9907f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 22f)
        horizontalLineTo(22.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 9f)
        lineTo(12.0661f, 7.04882f)
        curveTo(12.3519f, 6.98373f, 12.6481f, 6.98373f, 12.9339f, 7.04882f)
        lineTo(21.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.15f, 12.7f)
        lineTo(21.5f, 13f)
        moveTo(16.1f, 11.8f)
        lineTo(17f, 12f)
        moveTo(13.4f, 11.2f)
        lineTo(12.5f, 11f)
        lineTo(11.6f, 11.2f)
        moveTo(4.85f, 12.7f)
        lineTo(3.5f, 13f)
        moveTo(8.9f, 11.8f)
        lineTo(8f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 7f)
        verticalLineTo(22f)
        }
        }.build()

        return _kaaba01!!
    }

private var _kaaba01: ImageVector? = null
