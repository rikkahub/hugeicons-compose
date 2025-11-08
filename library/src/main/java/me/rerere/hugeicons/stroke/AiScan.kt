package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiScan: ImageVector
    get() {
        if (_aiScan != null) {
            return _aiScan!!
        }
        _aiScan = ImageVector.Builder(
            name = "AiScan",
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
        moveTo(2.5f, 16.5f)
        curveTo(2.5f, 17.4293f, 2.5f, 17.894f, 2.57686f, 18.2804f)
        curveTo(2.89249f, 19.8671f, 4.13288f, 21.1075f, 5.71964f, 21.4231f)
        curveTo(6.10603f, 21.5f, 6.57069f, 21.5f, 7.5f, 21.5f)
        moveTo(21.5f, 16.5f)
        curveTo(21.5f, 17.4293f, 21.5f, 17.894f, 21.4231f, 18.2804f)
        curveTo(21.1075f, 19.8671f, 19.8671f, 21.1075f, 18.2804f, 21.4231f)
        curveTo(17.894f, 21.5f, 17.4293f, 21.5f, 16.5f, 21.5f)
        moveTo(21.5f, 7.5f)
        curveTo(21.5f, 6.57069f, 21.5f, 6.10603f, 21.4231f, 5.71964f)
        curveTo(21.1075f, 4.13288f, 19.8671f, 2.89249f, 18.2804f, 2.57686f)
        curveTo(17.894f, 2.5f, 17.4293f, 2.5f, 16.5f, 2.5f)
        moveTo(2.5f, 7.5f)
        curveTo(2.5f, 6.57069f, 2.5f, 6.10603f, 2.57686f, 5.71964f)
        curveTo(2.89249f, 4.13288f, 4.13288f, 2.89249f, 5.71964f, 2.57686f)
        curveTo(6.10603f, 2.5f, 6.57069f, 2.5f, 7.5f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8.5f)
        verticalLineTo(6.5f)
        moveTo(10f, 11.5f)
        verticalLineTo(12f)
        moveTo(14f, 11.5f)
        verticalLineTo(12f)
        moveTo(11f, 8.5f)
        horizontalLineTo(13f)
        curveTo(14.8856f, 8.5f, 15.8284f, 8.5f, 16.4142f, 9.08579f)
        curveTo(17f, 9.67157f, 17f, 10.6144f, 17f, 12.5f)
        verticalLineTo(12.5f)
        curveTo(17f, 14.3856f, 17f, 15.3284f, 16.4142f, 15.9142f)
        curveTo(15.8284f, 16.5f, 14.8856f, 16.5f, 13f, 16.5f)
        horizontalLineTo(11f)
        curveTo(9.11438f, 16.5f, 8.17157f, 16.5f, 7.58579f, 15.9142f)
        curveTo(7f, 15.3284f, 7f, 14.3856f, 7f, 12.5f)
        verticalLineTo(12.5f)
        curveTo(7f, 10.6144f, 7f, 9.67157f, 7.58579f, 9.08579f)
        curveTo(8.17157f, 8.5f, 9.11438f, 8.5f, 11f, 8.5f)
        }
        }.build()

        return _aiScan!!
    }

private var _aiScan: ImageVector? = null
