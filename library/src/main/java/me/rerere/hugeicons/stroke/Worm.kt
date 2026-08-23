package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Worm: ImageVector
    get() {
        if (_worm != null) {
            return _worm!!
        }
        _worm = ImageVector.Builder(
            name = "Worm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6.5f, 19f)
            horizontalLineTo(5f)
            curveTo(3.89543f, 19f, 3f, 18.1046f, 3f, 17f)
            curveTo(3f, 15.8954f, 3.89543f, 15f, 5f, 15f)
            horizontalLineTo(7.5f)
            curveTo(7.96466f, 15f, 8.19698f, 15f, 8.39018f, 14.9616f)
            curveTo(9.18356f, 14.8038f, 9.80376f, 14.1836f, 9.96157f, 13.3902f)
            curveTo(10f, 13.197f, 10f, 12.9647f, 10f, 12.5f)
            curveTo(10f, 11.106f, 10f, 10.4091f, 10.1153f, 9.82946f)
            curveTo(10.5887f, 7.44931f, 12.4493f, 5.58873f, 14.8295f, 5.11529f)
            curveTo(15.4091f, 5f, 16.106f, 5f, 17.5f, 5f)
            horizontalLineTo(19f)
            curveTo(20.1046f, 5f, 21f, 5.89543f, 21f, 7f)
            curveTo(21f, 8.10457f, 20.1046f, 9f, 19f, 9f)
            horizontalLineTo(16.5f)
            curveTo(16.0353f, 9f, 15.803f, 9f, 15.6098f, 9.03843f)
            curveTo(14.8164f, 9.19624f, 14.1962f, 9.81644f, 14.0384f, 10.6098f)
            curveTo(14f, 10.803f, 14f, 11.0353f, 14f, 11.5f)
            curveTo(14f, 12.894f, 14f, 13.5909f, 13.8847f, 14.1705f)
            curveTo(13.4113f, 16.5507f, 11.5507f, 18.4113f, 9.17054f, 18.8847f)
            curveTo(8.59095f, 19f, 7.89397f, 19f, 6.5f, 19f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 9f)
            verticalLineTo(5f)
            moveTo(14f, 12f)
            curveTo(12.4379f, 12f, 11.5621f, 12f, 10f, 12f)
            moveTo(7f, 15f)
            verticalLineTo(19f)
            moveTo(9.5f, 14.5f)
            lineTo(12f, 17f)
            moveTo(14.5f, 9.5f)
            lineTo(12f, 7f)
        }
        }.build()

        return _worm!!
    }

private var _worm: ImageVector? = null
