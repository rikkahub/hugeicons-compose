package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pot01: ImageVector
    get() {
        if (_pot01 != null) {
            return _pot01!!
        }
        _pot01 = ImageVector.Builder(
            name = "Pot01",
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
        moveTo(2f, 9f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 9f)
        lineTo(4.50393f, 14.5432f)
        curveTo(4.73952f, 17.1348f, 4.85732f, 18.4305f, 5.71663f, 19.2153f)
        curveTo(6.57594f, 20f, 7.87705f, 20f, 10.4793f, 20f)
        horizontalLineTo(13.5207f)
        curveTo(16.1229f, 20f, 17.4241f, 20f, 18.2834f, 19.2153f)
        curveTo(19.1427f, 18.4305f, 19.2605f, 17.1348f, 19.4961f, 14.5432f)
        lineTo(20f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 6f)
        horizontalLineTo(20f)
        moveTo(9f, 6f)
        lineTo(9.62283f, 3.94291f)
        curveTo(9.85063f, 3.37343f, 10.4022f, 3f, 11.0155f, 3f)
        horizontalLineTo(12.9845f)
        curveTo(13.5978f, 3f, 14.1494f, 3.37343f, 14.3772f, 3.94291f)
        lineTo(15f, 6f)
        }
        }.build()

        return _pot01!!
    }

private var _pot01: ImageVector? = null
