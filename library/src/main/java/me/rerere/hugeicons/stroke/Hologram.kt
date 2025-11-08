package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hologram: ImageVector
    get() {
        if (_hologram != null) {
            return _hologram!!
        }
        _hologram = ImageVector.Builder(
            name = "Hologram",
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
        moveTo(3f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 19f)
        lineTo(16f, 15f)
        moveTo(8f, 15f)
        lineTo(7f, 19f)
        moveTo(12f, 16f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        curveTo(12.4955f, 7f, 12.9562f, 6.8015f, 13.8775f, 6.40451f)
        lineTo(14.5423f, 6.11803f)
        curveTo(16.1808f, 5.41202f, 17f, 5.05902f, 17f, 4.5f)
        curveTo(17f, 3.94098f, 16.1808f, 3.58798f, 14.5423f, 2.88197f)
        lineTo(13.8775f, 2.59549f)
        curveTo(12.9562f, 2.1985f, 12.4955f, 2f, 12f, 2f)
        curveTo(11.5045f, 2f, 11.0438f, 2.1985f, 10.1225f, 2.59549f)
        lineTo(9.45768f, 2.88197f)
        curveTo(7.81923f, 3.58798f, 7f, 3.94098f, 7f, 4.5f)
        curveTo(7f, 5.05902f, 7.81923f, 5.41202f, 9.45768f, 6.11803f)
        lineTo(10.1225f, 6.40451f)
        curveTo(11.0438f, 6.8015f, 11.5045f, 7f, 12f, 7f)
        moveTo(12f, 7f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 4.5f)
        verticalLineTo(10.5f)
        curveTo(17f, 11.059f, 16.1808f, 11.412f, 14.5423f, 12.118f)
        lineTo(13.8775f, 12.4045f)
        curveTo(12.9562f, 12.8015f, 12.4955f, 13f, 12f, 13f)
        curveTo(11.5045f, 13f, 11.0438f, 12.8015f, 10.1225f, 12.4045f)
        lineTo(9.45768f, 12.118f)
        curveTo(7.81923f, 11.412f, 7f, 11.059f, 7f, 10.5f)
        verticalLineTo(4.5f)
        }
        }.build()

        return _hologram!!
    }

private var _hologram: ImageVector? = null
