package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FilmRoll01: ImageVector
    get() {
        if (_filmRoll01 != null) {
            return _filmRoll01!!
        }
        _filmRoll01 = ImageVector.Builder(
            name = "FilmRoll01",
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
        moveTo(4f, 4.5f)
        horizontalLineTo(13f)
        verticalLineTo(22f)
        horizontalLineTo(4f)
        verticalLineTo(4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 4f)
        lineTo(6.32918f, 3.34164f)
        curveTo(6.44315f, 3.1137f, 6.50014f, 2.99973f, 6.56517f, 2.90086f)
        curveTo(6.88933f, 2.40808f, 7.41449f, 2.08351f, 8.00021f, 2.01396f)
        curveTo(8.11773f, 2f, 8.24515f, 2f, 8.5f, 2f)
        curveTo(8.75485f, 2f, 8.88227f, 2f, 8.99979f, 2.01396f)
        curveTo(9.58551f, 2.08351f, 10.1107f, 2.40808f, 10.4348f, 2.90086f)
        curveTo(10.4999f, 2.99973f, 10.5568f, 3.1137f, 10.6708f, 3.34164f)
        lineTo(11f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 4.5f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 7.5f)
        horizontalLineTo(18f)
        curveTo(19.4142f, 7.5f, 20.1213f, 7.5f, 20.5607f, 7.96131f)
        curveTo(21f, 8.42261f, 21f, 9.16764f, 21f, 10.6577f)
        curveTo(21f, 11.6731f, 21f, 12.1808f, 20.7504f, 12.5763f)
        curveTo(20.5008f, 12.9719f, 20.057f, 13.1691f, 19.1694f, 13.5636f)
        lineTo(18.2829f, 13.9576f)
        curveTo(17.6912f, 14.2206f, 17.3953f, 14.3521f, 17.2289f, 14.6158f)
        curveTo(17.0625f, 14.8794f, 17.0625f, 15.2179f, 17.0625f, 15.8949f)
        curveTo(17.0625f, 16.8882f, 17.0625f, 17.3849f, 16.7696f, 17.6925f)
        curveTo(16.4767f, 18f, 16.0053f, 18f, 15.0625f, 18f)
        horizontalLineTo(13f)
        verticalLineTo(7.5f)
        }
        }.build()

        return _filmRoll01!!
    }

private var _filmRoll01: ImageVector? = null
