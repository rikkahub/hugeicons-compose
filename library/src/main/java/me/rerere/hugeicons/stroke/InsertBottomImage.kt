package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InsertBottomImage: ImageVector
    get() {
        if (_insertBottomImage != null) {
            return _insertBottomImage!!
        }
        _insertBottomImage = ImageVector.Builder(
            name = "InsertBottomImage",
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
        moveTo(3f, 3f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 7f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 16f)
        curveTo(3f, 13.643f, 3f, 12.4645f, 3.73223f, 11.7322f)
        curveTo(4.46447f, 11f, 5.64298f, 11f, 8f, 11f)
        horizontalLineTo(16f)
        curveTo(18.357f, 11f, 19.5355f, 11f, 20.2678f, 11.7322f)
        curveTo(21f, 12.4645f, 21f, 13.643f, 21f, 16f)
        curveTo(21f, 18.357f, 21f, 19.5355f, 20.2678f, 20.2678f)
        curveTo(19.5355f, 21f, 18.357f, 21f, 16f, 21f)
        horizontalLineTo(8f)
        curveTo(5.64298f, 21f, 4.46447f, 21f, 3.73223f, 20.2678f)
        curveTo(3f, 19.5355f, 3f, 18.357f, 3f, 16f)
        }
        }.build()

        return _insertBottomImage!!
    }

private var _insertBottomImage: ImageVector? = null
