package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TestTube02: ImageVector
    get() {
        if (_testTube02 != null) {
            return _testTube02!!
        }
        _testTube02 = ImageVector.Builder(
            name = "TestTube02",
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
        moveTo(16f, 2f)
        verticalLineTo(18f)
        curveTo(16f, 20.2091f, 14.2091f, 22f, 12f, 22f)
        curveTo(9.79086f, 22f, 8f, 20.2091f, 8f, 18f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 8.55626f)
        curveTo(8.88889f, 7.40291f, 10.3106f, 8.23432f, 12f, 9.31817f)
        curveTo(14.2222f, 10.7439f, 15.5556f, 9.65003f, 16f, 8.6152f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 2f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 18.002f)
        lineTo(11.0087f, 17.9996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 14.002f)
        lineTo(13.0087f, 13.9996f)
        }
        }.build()

        return _testTube02!!
    }

private var _testTube02: ImageVector? = null
