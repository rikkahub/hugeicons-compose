package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chair05: ImageVector
    get() {
        if (_chair05 != null) {
            return _chair05!!
        }
        _chair05 = ImageVector.Builder(
            name = "Chair05",
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
        moveTo(8f, 17f)
        lineTo(7f, 22f)
        moveTo(16f, 17f)
        lineTo(17f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13f)
        curveTo(10.4783f, 13f, 8.86931f, 13.2925f, 7.60803f, 13.6838f)
        curveTo(6.6583f, 13.9784f, 5.89434f, 15.322f, 6.01199f, 16.4128f)
        curveTo(6.05558f, 16.8169f, 6.36877f, 17f, 6.69807f, 17f)
        horizontalLineTo(17.3019f)
        curveTo(17.6312f, 17f, 17.9444f, 16.8169f, 17.988f, 16.4128f)
        curveTo(18.1057f, 15.322f, 17.3417f, 13.9784f, 16.392f, 13.6838f)
        curveTo(15.1307f, 13.2925f, 13.5217f, 13f, 12f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.7733f, 14f)
        curveTo(17.0124f, 12.4321f, 18f, 10.3677f, 18f, 8.3553f)
        curveTo(18f, 4.30537f, 15.3137f, 2f, 12f, 2f)
        curveTo(8.68629f, 2f, 6f, 4.30537f, 6f, 8.3553f)
        curveTo(6f, 10.3677f, 6.98759f, 12.4321f, 8.22668f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.6698f, 2f)
        curveTo(13.8785f, 3.13257f, 14f, 4.56789f, 14f, 6.2739f)
        curveTo(14f, 8.69303f, 13.6362f, 11.178f, 13.1937f, 13f)
        moveTo(10.3302f, 2f)
        curveTo(10.1215f, 3.13257f, 10f, 4.56789f, 10f, 6.2739f)
        curveTo(10f, 8.69303f, 10.3638f, 11.178f, 10.8063f, 13f)
        }
        }.build()

        return _chair05!!
    }

private var _chair05: ImageVector? = null
