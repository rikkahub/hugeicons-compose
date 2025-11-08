package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RotateCrop: ImageVector
    get() {
        if (_rotateCrop != null) {
            return _rotateCrop!!
        }
        _rotateCrop = ImageVector.Builder(
            name = "RotateCrop",
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
        moveTo(2f, 15f)
        curveTo(2f, 18.87f, 5.13f, 22f, 9f, 22f)
        lineTo(7.95001f, 20.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 9f)
        curveTo(22f, 5.13f, 18.87f, 2f, 15f, 2f)
        lineTo(16.05f, 3.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 5f)
        verticalLineTo(12f)
        curveTo(7f, 14.357f, 7f, 15.5355f, 7.73223f, 16.2678f)
        curveTo(8.46447f, 17f, 9.64298f, 17f, 12f, 17f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 19f)
        lineTo(17f, 12f)
        curveTo(17f, 9.64298f, 17f, 8.46447f, 16.2678f, 7.73223f)
        curveTo(15.5355f, 7f, 14.357f, 7f, 12f, 7f)
        lineTo(5f, 7f)
        }
        }.build()

        return _rotateCrop!!
    }

private var _rotateCrop: ImageVector? = null
