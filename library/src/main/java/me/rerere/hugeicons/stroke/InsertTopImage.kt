package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InsertTopImage: ImageVector
    get() {
        if (_insertTopImage != null) {
            return _insertTopImage!!
        }
        _insertTopImage = ImageVector.Builder(
            name = "InsertTopImage",
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
        moveTo(3f, 17f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 8f)
        curveTo(3f, 5.64298f, 3f, 4.46447f, 3.73223f, 3.73223f)
        curveTo(4.46447f, 3f, 5.64298f, 3f, 8f, 3f)
        horizontalLineTo(16f)
        curveTo(18.357f, 3f, 19.5355f, 3f, 20.2678f, 3.73223f)
        curveTo(21f, 4.46447f, 21f, 5.64298f, 21f, 8f)
        curveTo(21f, 10.357f, 21f, 11.5355f, 20.2678f, 12.2678f)
        curveTo(19.5355f, 13f, 18.357f, 13f, 16f, 13f)
        horizontalLineTo(8f)
        curveTo(5.64298f, 13f, 4.46447f, 13f, 3.73223f, 12.2678f)
        curveTo(3f, 11.5355f, 3f, 10.357f, 3f, 8f)
        }
        }.build()

        return _insertTopImage!!
    }

private var _insertTopImage: ImageVector? = null
