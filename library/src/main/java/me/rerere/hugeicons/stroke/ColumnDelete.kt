package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ColumnDelete: ImageVector
    get() {
        if (_columnDelete != null) {
            return _columnDelete!!
        }
        _columnDelete = ImageVector.Builder(
            name = "ColumnDelete",
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
        moveTo(5.5f, 3f)
        curveTo(6.90446f, 3f, 7.60669f, 3f, 8.11114f, 3.37919f)
        curveTo(8.32952f, 3.54335f, 8.51702f, 3.75429f, 8.66294f, 3.99997f)
        curveTo(9f, 4.56747f, 9f, 5.35748f, 9f, 6.9375f)
        lineTo(9f, 17.0625f)
        curveTo(9f, 18.6425f, 9f, 19.4325f, 8.66294f, 20f)
        curveTo(8.51702f, 20.2457f, 8.32952f, 20.4566f, 8.11114f, 20.6208f)
        curveTo(7.60669f, 21f, 6.90446f, 21f, 5.5f, 21f)
        curveTo(4.09554f, 21f, 3.39331f, 21f, 2.88886f, 20.6208f)
        curveTo(2.67048f, 20.4566f, 2.48298f, 20.2457f, 2.33706f, 20f)
        curveTo(2f, 19.4325f, 2f, 18.6425f, 2f, 17.0625f)
        lineTo(2f, 6.9375f)
        curveTo(2f, 5.35748f, 2f, 4.56747f, 2.33706f, 3.99997f)
        curveTo(2.48298f, 3.75429f, 2.67048f, 3.54335f, 2.88886f, 3.37919f)
        curveTo(3.39331f, 3f, 4.09554f, 3f, 5.5f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 11.9375f)
        lineTo(20f, 17.0625f)
        curveTo(20f, 18.6425f, 20f, 19.4325f, 19.6629f, 20f)
        curveTo(19.517f, 20.2457f, 19.3295f, 20.4566f, 19.1111f, 20.6208f)
        curveTo(18.6067f, 21f, 17.9045f, 21f, 16.5f, 21f)
        curveTo(15.0955f, 21f, 14.3933f, 21f, 13.8889f, 20.6208f)
        curveTo(13.6705f, 20.4566f, 13.483f, 20.2457f, 13.3371f, 20f)
        curveTo(13f, 19.4325f, 13f, 18.6425f, 13f, 17.0625f)
        lineTo(13f, 6.9375f)
        curveTo(13f, 5.35748f, 13f, 4.56747f, 13.3371f, 3.99997f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 8.99936f)
        lineTo(16f, 3f)
        moveTo(22f, 3.00064f)
        lineTo(16f, 9f)
        }
        }.build()

        return _columnDelete!!
    }

private var _columnDelete: ImageVector? = null
