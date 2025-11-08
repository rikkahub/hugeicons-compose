package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Beater: ImageVector
    get() {
        if (_beater != null) {
            return _beater!!
        }
        _beater = ImageVector.Builder(
            name = "Beater",
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
        moveTo(6.5f, 5f)
        horizontalLineTo(17.5f)
        curveTo(18.9045f, 5f, 19.6067f, 5f, 20.1111f, 5.33706f)
        curveTo(20.3295f, 5.48298f, 20.517f, 5.67048f, 20.6629f, 5.88886f)
        curveTo(21f, 6.39331f, 21f, 7.09554f, 21f, 8.5f)
        curveTo(21f, 9.90446f, 21f, 10.6067f, 20.6629f, 11.1111f)
        curveTo(20.517f, 11.3295f, 20.3295f, 11.517f, 20.1111f, 11.6629f)
        curveTo(19.6067f, 12f, 18.9045f, 12f, 17.5f, 12f)
        horizontalLineTo(6.5f)
        curveTo(5.09554f, 12f, 4.39331f, 12f, 3.88886f, 11.6629f)
        curveTo(3.67048f, 11.517f, 3.48298f, 11.3295f, 3.33706f, 11.1111f)
        curveTo(3f, 10.6067f, 3f, 9.90446f, 3f, 8.5f)
        curveTo(3f, 7.09554f, 3f, 6.39331f, 3.33706f, 5.88886f)
        curveTo(3.48298f, 5.67048f, 3.67048f, 5.48298f, 3.88886f, 5.33706f)
        curveTo(4.39331f, 5f, 5.09554f, 5f, 6.5f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 16f)
        horizontalLineTo(15.5f)
        curveTo(14.6716f, 16f, 14f, 16.6716f, 14f, 17.5f)
        verticalLineTo(19.5f)
        curveTo(14f, 20.3284f, 14.6716f, 21f, 15.5f, 21f)
        horizontalLineTo(17.5f)
        curveTo(18.3284f, 21f, 19f, 20.3284f, 19f, 19.5f)
        verticalLineTo(17.5f)
        curveTo(19f, 16.6716f, 18.3284f, 16f, 17.5f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 22f)
        verticalLineTo(21f)
        moveTo(16.5f, 12f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 2f)
        horizontalLineTo(15f)
        curveTo(15.9319f, 2f, 16.3978f, 2f, 16.7654f, 2.15224f)
        curveTo(17.2554f, 2.35523f, 17.6448f, 2.74458f, 17.8478f, 3.23463f)
        curveTo(18f, 3.60218f, 18f, 4.06812f, 18f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 8.5f)
        horizontalLineTo(16.991f)
        moveTo(13.009f, 8.5f)
        horizontalLineTo(13f)
        }
        }.build()

        return _beater!!
    }

private var _beater: ImageVector? = null
