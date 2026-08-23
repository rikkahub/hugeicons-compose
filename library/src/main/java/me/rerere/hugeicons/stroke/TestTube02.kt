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
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 2f)
            verticalLineTo(18f)
            curveTo(16f, 20.2091f, 14.2091f, 22f, 12f, 22f)
            curveTo(9.79086f, 22f, 8f, 20.2091f, 8f, 18f)
            verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 8.55626f)
            curveTo(8.88889f, 7.40291f, 10.3106f, 8.23432f, 12f, 9.31817f)
            curveTo(14.2222f, 10.7439f, 15.5556f, 9.65003f, 16f, 8.6152f)
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
            moveTo(7f, 2f)
            horizontalLineTo(17f)
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
            moveTo(13.125f, 14f)
            horizontalLineTo(13f)
            moveTo(13.25f, 14f)
            curveTo(13.25f, 14.1381f, 13.1381f, 14.25f, 13f, 14.25f)
            curveTo(12.8619f, 14.25f, 12.75f, 14.1381f, 12.75f, 14f)
            curveTo(12.75f, 13.8619f, 12.8619f, 13.75f, 13f, 13.75f)
            curveTo(13.1381f, 13.75f, 13.25f, 13.8619f, 13.25f, 14f)
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
            moveTo(11.125f, 18f)
            horizontalLineTo(11f)
            moveTo(11.25f, 18f)
            curveTo(11.25f, 18.1381f, 11.1381f, 18.25f, 11f, 18.25f)
            curveTo(10.8619f, 18.25f, 10.75f, 18.1381f, 10.75f, 18f)
            curveTo(10.75f, 17.8619f, 10.8619f, 17.75f, 11f, 17.75f)
            curveTo(11.1381f, 17.75f, 11.25f, 17.8619f, 11.25f, 18f)
            close()
        }
        }.build()

        return _testTube02!!
    }

private var _testTube02: ImageVector? = null
