package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InsertCenterImage: ImageVector
    get() {
        if (_insertCenterImage != null) {
            return _insertCenterImage!!
        }
        _insertCenterImage = ImageVector.Builder(
            name = "InsertCenterImage",
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
        moveTo(3f, 12f)
        curveTo(3f, 9.64298f, 3f, 8.46447f, 3.73223f, 7.73223f)
        curveTo(4.46447f, 7f, 5.64298f, 7f, 8f, 7f)
        horizontalLineTo(16f)
        curveTo(18.357f, 7f, 19.5355f, 7f, 20.2678f, 7.73223f)
        curveTo(21f, 8.46447f, 21f, 9.64298f, 21f, 12f)
        curveTo(21f, 14.357f, 21f, 15.5355f, 20.2678f, 16.2678f)
        curveTo(19.5355f, 17f, 18.357f, 17f, 16f, 17f)
        horizontalLineTo(8f)
        curveTo(5.64298f, 17f, 4.46447f, 17f, 3.73223f, 16.2678f)
        curveTo(3f, 15.5355f, 3f, 14.357f, 3f, 12f)
        }
        }.build()

        return _insertCenterImage!!
    }

private var _insertCenterImage: ImageVector? = null
