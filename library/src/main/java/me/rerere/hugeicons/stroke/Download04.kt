package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Download04: ImageVector
    get() {
        if (_download04 != null) {
            return _download04!!
        }
        _download04 = ImageVector.Builder(
            name = "Download04",
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
        moveTo(16.9504f, 12.1817f)
        curveTo(17.1981f, 12.814f, 16.5076f, 13.5726f, 15.1267f, 15.0899f)
        curveTo(13.6702f, 16.6902f, 12.9201f, 17.4904f, 12f, 17.5f)
        curveTo(11.0799f, 17.4904f, 10.3298f, 16.6902f, 8.87331f, 15.0899f)
        curveTo(7.49239f, 13.5726f, 6.80193f, 12.814f, 7.04964f, 12.1817f)
        curveTo(7.05868f, 12.1586f, 7.06851f, 12.1359f, 7.0791f, 12.1135f)
        curveTo(7.34928f, 11.542f, 8.24477f, 11.5029f, 10f, 11.5002f)
        verticalLineTo(4.99998f)
        curveTo(10f, 4.53501f, 10f, 4.30253f, 10.0511f, 4.11179f)
        curveTo(10.1898f, 3.59414f, 10.5941f, 3.1898f, 11.1118f, 3.05111f)
        curveTo(11.3025f, 3f, 11.535f, 3f, 12f, 3f)
        curveTo(12.4649f, 3f, 12.6974f, 3f, 12.8882f, 3.05111f)
        curveTo(13.4058f, 3.1898f, 13.8102f, 3.59414f, 13.9489f, 4.11179f)
        curveTo(14f, 4.30253f, 14f, 4.53501f, 14f, 4.99998f)
        verticalLineTo(11.5002f)
        curveTo(15.7552f, 11.5029f, 16.6507f, 11.542f, 16.9209f, 12.1135f)
        curveTo(16.9315f, 12.1359f, 16.9413f, 12.1586f, 16.9504f, 12.1817f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.00006f, 21f)
        horizontalLineTo(19.0001f)
        }
        }.build()

        return _download04!!
    }

private var _download04: ImageVector? = null
