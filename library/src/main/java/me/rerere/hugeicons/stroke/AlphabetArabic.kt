package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphabetArabic: ImageVector
    get() {
        if (_alphabetArabic != null) {
            return _alphabetArabic!!
        }
        _alphabetArabic = ImageVector.Builder(
            name = "AlphabetArabic",
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
        moveTo(9f, 4f)
        lineTo(9f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 14f)
        horizontalLineTo(20.743f)
        curveTo(21.4486f, 14f, 21.8015f, 14f, 21.9479f, 13.7401f)
        curveTo(22.0944f, 13.4803f, 21.9203f, 13.2157f, 21.5721f, 12.6867f)
        curveTo(20.4517f, 10.9841f, 18.7844f, 10f, 17.117f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 4f)
        verticalLineTo(17.6667f)
        curveTo(13f, 18.7666f, 13f, 19.3166f, 12.7071f, 19.6583f)
        curveTo(12.4142f, 20f, 11.9428f, 20f, 11f, 20f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 4f)
        verticalLineTo(17.6667f)
        curveTo(5f, 18.7666f, 5f, 19.3166f, 4.70711f, 19.6583f)
        curveTo(4.41421f, 20f, 3.94281f, 20f, 3f, 20f)
        horizontalLineTo(2f)
        }
        }.build()

        return _alphabetArabic!!
    }

private var _alphabetArabic: ImageVector? = null
