package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DownloadCircle02: ImageVector
    get() {
        if (_downloadCircle02 != null) {
            return _downloadCircle02!!
        }
        _downloadCircle02 = ImageVector.Builder(
            name = "DownloadCircle02",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 10.5f)
        curveTo(15.5f, 10.5f, 12.9223f, 14f, 12f, 14f)
        curveTo(11.0777f, 14f, 8.5f, 10.5f, 8.5f, 10.5f)
        moveTo(12f, 13.5f)
        verticalLineTo(6.99997f)
        moveTo(8.5f, 17f)
        horizontalLineTo(15.5f)
        }
        }.build()

        return _downloadCircle02!!
    }

private var _downloadCircle02: ImageVector? = null
