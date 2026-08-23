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

val HugeIcons.Beater: ImageVector
    get() {
        if (_beater != null) {
            return _beater!!
        }
        _beater = ImageVector.Builder(
            name = "Beater",
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
            moveTo(17.5f, 15f)
            horizontalLineTo(14.5f)
            curveTo(13.6716f, 15f, 13f, 15.6716f, 13f, 16.5f)
            verticalLineTo(19.5f)
            curveTo(13f, 20.3284f, 13.6716f, 21f, 14.5f, 21f)
            horizontalLineTo(17.5f)
            curveTo(18.3284f, 21f, 19f, 20.3284f, 19f, 19.5f)
            verticalLineTo(16.5f)
            curveTo(19f, 15.6716f, 18.3284f, 15f, 17.5f, 15f)
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
            moveTo(16f, 11f)
            verticalLineTo(21f)
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
            moveTo(18.7143f, 11f)
            horizontalLineTo(7f)
            curveTo(5.11438f, 11f, 4.17157f, 11f, 3.58579f, 10.4142f)
            curveTo(3f, 9.82843f, 3f, 8.88562f, 3f, 7f)
            curveTo(3f, 5.11438f, 3f, 4.17157f, 3.58579f, 3.58579f)
            curveTo(4.17157f, 3f, 5.11438f, 3f, 7f, 3f)
            horizontalLineTo(15.2857f)
            curveTo(15.9491f, 3f, 16.2808f, 3f, 16.5598f, 3.03144f)
            curveTo(18.8779f, 3.29263f, 20.7074f, 5.12208f, 20.9686f, 7.44018f)
            curveTo(21f, 7.71921f, 21f, 8.0509f, 21f, 8.71429f)
            curveTo(21f, 8.97964f, 21f, 9.11232f, 20.9874f, 9.22393f)
            curveTo(20.8829f, 10.1512f, 20.1512f, 10.8829f, 19.2239f, 10.9874f)
            curveTo(19.1123f, 11f, 18.9796f, 11f, 18.7143f, 11f)
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
            moveTo(6f, 7f)
            horizontalLineTo(10f)
        }
        }.build()

        return _beater!!
    }

private var _beater: ImageVector? = null
