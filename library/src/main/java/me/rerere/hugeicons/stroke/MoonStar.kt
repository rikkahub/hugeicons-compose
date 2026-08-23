package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoonStar: ImageVector
    get() {
        if (_moonStar != null) {
            return _moonStar!!
        }
        _moonStar = ImageVector.Builder(
            name = "MoonStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.7422f, 2.25f)
            lineTo(18.037f, 3.0466f)
            curveTo(18.4235f, 4.09117f, 18.6167f, 4.61345f, 18.9977f, 4.99445f)
            curveTo(19.3787f, 5.37545f, 19.901f, 5.56871f, 20.9456f, 5.95523f)
            lineTo(21.7422f, 6.25f)
            lineTo(20.9456f, 6.54477f)
            curveTo(19.901f, 6.93129f, 19.3787f, 7.12455f, 18.9977f, 7.50555f)
            curveTo(18.6167f, 7.88655f, 18.4235f, 8.40883f, 18.037f, 9.4534f)
            lineTo(17.7422f, 10.25f)
            lineTo(17.4474f, 9.4534f)
            curveTo(17.0609f, 8.40883f, 16.8676f, 7.88655f, 16.4866f, 7.50555f)
            curveTo(16.1056f, 7.12455f, 15.5834f, 6.93129f, 14.5388f, 6.54477f)
            lineTo(13.7422f, 6.25f)
            lineTo(14.5388f, 5.95523f)
            curveTo(15.5834f, 5.56871f, 16.1056f, 5.37545f, 16.4866f, 4.99445f)
            curveTo(16.8676f, 4.61345f, 17.0609f, 4.09117f, 17.4474f, 3.0466f)
            lineTo(17.7422f, 2.25f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.2422f, 14.3284f)
            curveTo(20.0425f, 14.9689f, 18.6723f, 15.3321f, 17.2173f, 15.3321f)
            curveTo(12.4913f, 15.3321f, 8.66011f, 11.5009f, 8.66011f, 6.77485f)
            curveTo(8.66011f, 5.31986f, 9.02324f, 3.94968f, 9.66382f, 2.75f)
            curveTo(5.40984f, 3.74698f, 2.24219f, 7.56513f, 2.24219f, 12.1231f)
            curveTo(2.24219f, 17.4399f, 6.55229f, 21.75f, 11.8691f, 21.75f)
            curveTo(16.4271f, 21.75f, 20.2452f, 18.5824f, 21.2422f, 14.3284f)
            close()
        }
        }.build()

        return _moonStar!!
    }

private var _moonStar: ImageVector? = null
