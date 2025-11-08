package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Discord: ImageVector
    get() {
        if (_discord != null) {
            return _discord!!
        }
        _discord = ImageVector.Builder(
            name = "Discord",
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
        moveTo(15.5008f, 17.75f)
        lineTo(16.7942f, 19.5205f)
        curveTo(16.9156f, 19.7127f, 17.1489f, 19.7985f, 17.3619f, 19.7224f)
        curveTo(18.1657f, 19.4353f, 20.158f, 18.6572f, 21.7984f, 17.4725f)
        curveTo(21.9263f, 17.3801f, 22.0002f, 17.2261f, 21.9992f, 17.0673f)
        curveTo(21.9992f, 8.25f, 19.5008f, 5.75f, 19.5008f, 5.75f)
        curveTo(19.5008f, 5.75f, 17.5008f, 4.60213f, 15.3547f, 4.25602f)
        curveTo(15.1436f, 4.22196f, 14.9368f, 4.33509f, 14.8429f, 4.52891f)
        lineTo(14.3979f, 5.44677f)
        curveTo(14.3979f, 5.44677f, 13.2853f, 5.21397f, 12f, 5.21397f)
        curveTo(10.7147f, 5.21397f, 9.6021f, 5.44677f, 9.6021f, 5.44677f)
        lineTo(9.15711f, 4.52891f)
        curveTo(9.06314f, 4.33509f, 8.85644f, 4.22196f, 8.64529f, 4.25602f)
        curveTo(6.50079f, 4.60187f, 4.50079f, 5.75f, 4.50079f, 5.75f)
        curveTo(4.50079f, 5.75f, 2.0008f, 8.25f, 2.0008f, 17.0673f)
        curveTo(1.9998f, 17.2261f, 2.07365f, 17.3801f, 2.20159f, 17.4725f)
        curveTo(3.84196f, 18.6572f, 5.8343f, 19.4353f, 6.63806f, 19.7224f)
        curveTo(6.85105f, 19.7985f, 7.08437f, 19.7127f, 7.20582f, 19.5205f)
        lineTo(8.50079f, 17.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5008f, 16.75f)
        curveTo(17.5008f, 16.75f, 15.2057f, 18.25f, 12.0008f, 18.25f)
        curveTo(8.79587f, 18.25f, 6.50079f, 16.75f, 6.50079f, 16.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.2508f, 12.25f)
        curveTo(17.2508f, 13.3546f, 16.4673f, 14.25f, 15.5008f, 14.25f)
        curveTo(14.5343f, 14.25f, 13.7508f, 13.3546f, 13.7508f, 12.25f)
        curveTo(13.7508f, 11.1454f, 14.5343f, 10.25f, 15.5008f, 10.25f)
        curveTo(16.4673f, 10.25f, 17.2508f, 11.1454f, 17.2508f, 12.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.2508f, 12.25f)
        curveTo(10.2508f, 13.3546f, 9.46729f, 14.25f, 8.50079f, 14.25f)
        curveTo(7.5343f, 14.25f, 6.75079f, 13.3546f, 6.75079f, 12.25f)
        curveTo(6.75079f, 11.1454f, 7.5343f, 10.25f, 8.50079f, 10.25f)
        curveTo(9.46729f, 10.25f, 10.2508f, 11.1454f, 10.2508f, 12.25f)
        }
        }.build()

        return _discord!!
    }

private var _discord: ImageVector? = null
