package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RowDelete: ImageVector
    get() {
        if (_rowDelete != null) {
            return _rowDelete!!
        }
        _rowDelete = ImageVector.Builder(
            name = "RowDelete",
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
        moveTo(21f, 18.5f)
        curveTo(21f, 19.9045f, 21f, 20.6067f, 20.6208f, 21.1111f)
        curveTo(20.4567f, 21.3295f, 20.2457f, 21.517f, 20f, 21.6629f)
        curveTo(19.4325f, 22f, 18.6425f, 22f, 17.0625f, 22f)
        lineTo(6.9375f, 22f)
        curveTo(5.35748f, 22f, 4.56747f, 22f, 3.99997f, 21.6629f)
        curveTo(3.75429f, 21.517f, 3.54335f, 21.3295f, 3.37919f, 21.1111f)
        curveTo(3f, 20.6067f, 3f, 19.9045f, 3f, 18.5f)
        curveTo(3f, 17.0955f, 3f, 16.3933f, 3.37919f, 15.8889f)
        curveTo(3.54335f, 15.6705f, 3.75429f, 15.483f, 3.99997f, 15.3371f)
        curveTo(4.56747f, 15f, 5.35748f, 15f, 6.9375f, 15f)
        lineTo(17.0625f, 15f)
        curveTo(18.6425f, 15f, 19.4325f, 15f, 20f, 15.3371f)
        curveTo(20.2457f, 15.483f, 20.4567f, 15.6705f, 20.6208f, 15.8889f)
        curveTo(21f, 16.3933f, 21f, 17.0955f, 21f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0625f, 4f)
        lineTo(6.9375f, 4f)
        curveTo(5.35748f, 4f, 4.56747f, 4f, 3.99997f, 4.33706f)
        curveTo(3.75429f, 4.48298f, 3.54335f, 4.67048f, 3.37919f, 4.88886f)
        curveTo(3f, 5.39331f, 3f, 6.09554f, 3f, 7.5f)
        curveTo(3f, 8.90446f, 3f, 9.60669f, 3.37919f, 10.1111f)
        curveTo(3.54335f, 10.3295f, 3.75429f, 10.517f, 3.99997f, 10.6629f)
        curveTo(4.56747f, 11f, 5.35748f, 11f, 6.9375f, 11f)
        lineTo(17.0625f, 11f)
        curveTo(18.6425f, 11f, 19.4325f, 11f, 20f, 10.6629f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 7.99936f)
        lineTo(15f, 2f)
        moveTo(21f, 2.00064f)
        lineTo(15f, 8f)
        }
        }.build()

        return _rowDelete!!
    }

private var _rowDelete: ImageVector? = null
