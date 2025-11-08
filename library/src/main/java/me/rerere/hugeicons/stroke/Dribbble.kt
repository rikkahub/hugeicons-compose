package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dribbble: ImageVector
    get() {
        if (_dribbble != null) {
            return _dribbble!!
        }
        _dribbble = ImageVector.Builder(
            name = "Dribbble",
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
        moveTo(22f, 13.2644f)
        curveTo(21.0732f, 13.0906f, 20.12f, 13f, 19.1472f, 13f)
        curveTo(13.7948f, 13f, 9.03435f, 15.7425f, 6f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 5f)
        curveTo(15.8705f, 8.66742f, 11.1679f, 11f, 5.90962f, 11f)
        curveTo(4.56437f, 11f, 3.25548f, 10.8473f, 2f, 10.5587f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.6178f, 22f)
        curveTo(14.8684f, 20.786f, 15f, 19.5287f, 15f, 18.2407f)
        curveTo(15f, 11.9247f, 11.8343f, 6.34645f, 7f, 3f)
        }
        }.build()

        return _dribbble!!
    }

private var _dribbble: ImageVector? = null
