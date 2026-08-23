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

val HugeIcons.FaceMimic: ImageVector
    get() {
        if (_faceMimic != null) {
            return _faceMimic!!
        }
        _faceMimic = ImageVector.Builder(
            name = "FaceMimic",
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
            moveTo(17f, 15f)
            curveTo(16.002f, 16.7934f, 14.1365f, 18f, 12f, 18f)
            curveTo(9.86346f, 18f, 7.99804f, 16.7934f, 7f, 15f)
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
            moveTo(8f, 8f)
            verticalLineTo(10f)
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
            moveTo(16.5f, 21.5f)
            curveTo(17.4293f, 21.5f, 17.894f, 21.5f, 18.2804f, 21.4231f)
            curveTo(19.8671f, 21.1075f, 21.1075f, 19.8671f, 21.4231f, 18.2804f)
            curveTo(21.5f, 17.894f, 21.5f, 17.4293f, 21.5f, 16.5f)
            moveTo(7.5f, 21.5f)
            curveTo(6.57069f, 21.5f, 6.10603f, 21.5f, 5.71964f, 21.4231f)
            curveTo(4.13288f, 21.1075f, 2.89249f, 19.8671f, 2.57686f, 18.2804f)
            curveTo(2.5f, 17.894f, 2.5f, 17.4293f, 2.5f, 16.5f)
            moveTo(16.5f, 2.5f)
            curveTo(17.4293f, 2.5f, 17.894f, 2.5f, 18.2804f, 2.57686f)
            curveTo(19.8671f, 2.89249f, 21.1075f, 4.13288f, 21.4231f, 5.71964f)
            curveTo(21.5f, 6.10603f, 21.5f, 6.57069f, 21.5f, 7.5f)
            moveTo(7.5f, 2.5f)
            curveTo(6.57069f, 2.5f, 6.10603f, 2.5f, 5.71964f, 2.57686f)
            curveTo(4.13288f, 2.89249f, 2.89249f, 4.13288f, 2.57686f, 5.71964f)
            curveTo(2.5f, 6.10603f, 2.5f, 6.57069f, 2.5f, 7.5f)
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
            moveTo(16f, 7.75f)
            verticalLineTo(9f)
            moveTo(16f, 9f)
            verticalLineTo(10.25f)
            moveTo(16f, 9f)
            horizontalLineTo(15f)
            moveTo(16f, 9f)
            horizontalLineTo(17f)
            moveTo(18f, 9f)
            lineTo(17.1325f, 8.71082f)
            curveTo(16.7343f, 8.57811f, 16.4219f, 8.26568f, 16.2892f, 7.86754f)
            lineTo(16f, 7f)
            lineTo(15.7108f, 7.86754f)
            curveTo(15.5781f, 8.26568f, 15.2657f, 8.57811f, 14.8675f, 8.71082f)
            lineTo(14f, 9f)
            lineTo(14.8675f, 9.28918f)
            curveTo(15.2657f, 9.42189f, 15.5781f, 9.73432f, 15.7108f, 10.1325f)
            lineTo(16f, 11f)
            lineTo(16.2892f, 10.1325f)
            curveTo(16.4219f, 9.73432f, 16.7343f, 9.42189f, 17.1325f, 9.28918f)
            lineTo(18f, 9f)
            close()
        }
        }.build()

        return _faceMimic!!
    }

private var _faceMimic: ImageVector? = null
