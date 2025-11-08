package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon3DView: ImageVector
    get() {
        if (_icon3DView != null) {
            return _icon3DView!!
        }
        _icon3DView = ImageVector.Builder(
            name = "Icon3DView",
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
        moveTo(12f, 11.5f)
        curveTo(12.4955f, 11.5f, 12.9562f, 11.3015f, 13.8775f, 10.9045f)
        lineTo(14.5423f, 10.618f)
        curveTo(16.1808f, 9.91202f, 17f, 9.55902f, 17f, 9f)
        curveTo(17f, 8.44098f, 16.1808f, 8.08798f, 14.5423f, 7.38197f)
        lineTo(13.8775f, 7.09549f)
        curveTo(12.9562f, 6.6985f, 12.4955f, 6.5f, 12f, 6.5f)
        curveTo(11.5045f, 6.5f, 11.0438f, 6.6985f, 10.1225f, 7.09549f)
        lineTo(9.45768f, 7.38197f)
        curveTo(7.81923f, 8.08798f, 7f, 8.44098f, 7f, 9f)
        curveTo(7f, 9.55902f, 7.81923f, 9.91202f, 9.45768f, 10.618f)
        lineTo(10.1225f, 10.9045f)
        curveTo(11.0438f, 11.3015f, 11.5045f, 11.5f, 12f, 11.5f)
        moveTo(12f, 11.5f)
        verticalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 9f)
        verticalLineTo(15f)
        curveTo(17f, 15.559f, 16.1808f, 15.912f, 14.5423f, 16.618f)
        lineTo(13.8775f, 16.9045f)
        curveTo(12.9562f, 17.3015f, 12.4955f, 17.5f, 12f, 17.5f)
        curveTo(11.5045f, 17.5f, 11.0438f, 17.3015f, 10.1225f, 16.9045f)
        lineTo(9.45768f, 16.618f)
        curveTo(7.81923f, 15.912f, 7f, 15.559f, 7f, 15f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.14426f, 2.5f)
        curveTo(6.48724f, 2.56075f, 4.93529f, 2.81456f, 3.87493f, 3.87493f)
        curveTo(2.81456f, 4.93529f, 2.56075f, 6.48724f, 2.5f, 9.14426f)
        moveTo(14.8557f, 2.5f)
        curveTo(17.5128f, 2.56075f, 19.0647f, 2.81456f, 20.1251f, 3.87493f)
        curveTo(21.1854f, 4.93529f, 21.4392f, 6.48724f, 21.5f, 9.14426f)
        moveTo(14.8557f, 21.5f)
        curveTo(17.5128f, 21.4392f, 19.0647f, 21.1854f, 20.1251f, 20.1251f)
        curveTo(21.1854f, 19.0647f, 21.4392f, 17.5128f, 21.5f, 14.8557f)
        moveTo(9.14426f, 21.5f)
        curveTo(6.48724f, 21.4392f, 4.93529f, 21.1854f, 3.87493f, 20.1251f)
        curveTo(2.81456f, 19.0647f, 2.56075f, 17.5128f, 2.5f, 14.8557f)
        }
        }.build()

        return _icon3DView!!
    }

private var _icon3DView: ImageVector? = null
