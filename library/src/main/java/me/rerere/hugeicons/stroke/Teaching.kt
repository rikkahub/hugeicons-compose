package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Teaching: ImageVector
    get() {
        if (_teaching != null) {
            return _teaching!!
        }
        _teaching = ImageVector.Builder(
            name = "Teaching",
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
        moveTo(13f, 15f)
        curveTo(10.7083f, 21f, 4.29167f, 15f, 2f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 15f)
        horizontalLineTo(17.0013f)
        curveTo(19.3583f, 15f, 20.5368f, 15f, 21.2691f, 14.2678f)
        curveTo(22.0013f, 13.5355f, 22.0013f, 12.357f, 22.0013f, 10f)
        verticalLineTo(8f)
        curveTo(22.0013f, 5.64298f, 22.0013f, 4.46447f, 21.2691f, 3.73223f)
        curveTo(20.5368f, 3f, 19.3583f, 3f, 17.0013f, 3f)
        horizontalLineTo(13.0013f)
        curveTo(10.6443f, 3f, 9.46576f, 3f, 8.73353f, 3.73223f)
        curveTo(8.11312f, 4.35264f, 8.01838f, 5.29344f, 8.00391f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        horizontalLineTo(18f)
        moveTo(18f, 11f)
        horizontalLineTo(15f)
        }
        }.build()

        return _teaching!!
    }

private var _teaching: ImageVector? = null
