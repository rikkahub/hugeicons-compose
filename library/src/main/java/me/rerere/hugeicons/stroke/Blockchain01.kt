package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Blockchain01: ImageVector
    get() {
        if (_blockchain01 != null) {
            return _blockchain01!!
        }
        _blockchain01 = ImageVector.Builder(
            name = "Blockchain01",
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
        moveTo(12f, 21f)
        curveTo(12.2792f, 21f, 12.5388f, 20.8728f, 13.0579f, 20.6184f)
        lineTo(17.2304f, 18.5737f)
        curveTo(19.0768f, 17.6688f, 20f, 17.2164f, 20f, 16.5f)
        verticalLineTo(7.5f)
        moveTo(12f, 21f)
        curveTo(11.7208f, 21f, 11.4612f, 20.8728f, 10.9421f, 20.6184f)
        lineTo(6.76956f, 18.5737f)
        curveTo(4.92319f, 17.6688f, 4f, 17.2164f, 4f, 16.5f)
        verticalLineTo(7.5f)
        moveTo(12f, 21f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9421f, 3.38159f)
        curveTo(11.4612f, 3.1272f, 11.7208f, 3f, 12f, 3f)
        curveTo(12.2792f, 3f, 12.5388f, 3.1272f, 13.0579f, 3.38159f)
        lineTo(17.2304f, 5.42635f)
        curveTo(19.0768f, 6.33116f, 20f, 6.78357f, 20f, 7.5f)
        curveTo(20f, 8.21643f, 19.0768f, 8.66884f, 17.2304f, 9.57365f)
        lineTo(13.0579f, 11.6184f)
        curveTo(12.5388f, 11.8728f, 12.2792f, 12f, 12f, 12f)
        curveTo(11.7208f, 12f, 11.4612f, 11.8728f, 10.9421f, 11.6184f)
        lineTo(6.76956f, 9.57365f)
        curveTo(4.92319f, 8.66884f, 4f, 8.21643f, 4f, 7.5f)
        curveTo(4f, 6.78357f, 4.92319f, 6.33116f, 6.76956f, 5.42635f)
        lineTo(10.9421f, 3.38159f)
        }
        }.build()

        return _blockchain01!!
    }

private var _blockchain01: ImageVector? = null
