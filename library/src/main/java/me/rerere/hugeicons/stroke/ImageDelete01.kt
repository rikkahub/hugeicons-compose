package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageDelete01: ImageVector
    get() {
        if (_imageDelete01 != null) {
            return _imageDelete01!!
        }
        _imageDelete01 = ImageVector.Builder(
            name = "ImageDelete01",
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
        moveTo(5f, 21f)
        curveTo(9.20998f, 16.2487f, 13.9412f, 9.9475f, 21f, 14.6734f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12.5f)
        curveTo(21f, 16.9783f, 21f, 19.2175f, 19.6088f, 20.6088f)
        curveTo(18.2175f, 22f, 15.9783f, 22f, 11.5f, 22f)
        curveTo(7.02166f, 22f, 4.78249f, 22f, 3.39124f, 20.6088f)
        curveTo(2f, 19.2175f, 2f, 16.9783f, 2f, 12.5f)
        curveTo(2f, 8.02166f, 2f, 5.78249f, 3.39124f, 4.39124f)
        curveTo(4.78249f, 3f, 7.02166f, 3f, 11.5f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 9f)
        lineTo(18.5f, 5.5f)
        moveTo(18.5f, 5.5f)
        lineTo(15f, 2f)
        moveTo(18.5f, 5.5f)
        lineTo(22f, 2f)
        moveTo(18.5f, 5.5f)
        lineTo(15f, 9f)
        }
        }.build()

        return _imageDelete01!!
    }

private var _imageDelete01: ImageVector? = null
