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

val HugeIcons.SquareStack: ImageVector
    get() {
        if (_squareStack != null) {
            return _squareStack!!
        }
        _squareStack = ImageVector.Builder(
            name = "SquareStack",
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
            moveTo(20.7275f, 14.365f)
            curveTo(21f, 14.8998f, 21f, 15.5999f, 21f, 17f)
            curveTo(21f, 18.4001f, 21f, 19.1002f, 20.7275f, 19.635f)
            curveTo(20.4878f, 20.1054f, 20.1054f, 20.4878f, 19.635f, 20.7275f)
            curveTo(19.1002f, 21f, 18.4001f, 21f, 17f, 21f)
            curveTo(15.5999f, 21f, 14.8998f, 21f, 14.365f, 20.7275f)
            curveTo(13.8946f, 20.4878f, 13.5122f, 20.1054f, 13.2725f, 19.635f)
            curveTo(13f, 19.1002f, 13f, 18.4001f, 13f, 17f)
            curveTo(13f, 15.5999f, 13f, 14.8998f, 13.2725f, 14.365f)
            curveTo(13.5122f, 13.8946f, 13.8946f, 13.5122f, 14.365f, 13.2725f)
            curveTo(14.8998f, 13f, 15.5999f, 13f, 17f, 13f)
            curveTo(18.4001f, 13f, 19.1002f, 13f, 19.635f, 13.2725f)
            curveTo(20.1054f, 13.5122f, 20.4878f, 13.8946f, 20.7275f, 14.365f)
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
            moveTo(15.9235f, 10f)
            curveTo(15.8832f, 9.75397f, 15.8216f, 9.54965f, 15.7275f, 9.36502f)
            curveTo(15.4878f, 8.89462f, 15.1054f, 8.51217f, 14.635f, 8.27248f)
            curveTo(14.1002f, 8f, 13.4001f, 8f, 12f, 8f)
            curveTo(10.5999f, 8f, 9.8998f, 8f, 9.36502f, 8.27248f)
            curveTo(8.89462f, 8.51217f, 8.51217f, 8.89462f, 8.27248f, 9.36502f)
            curveTo(8f, 9.8998f, 8f, 10.5999f, 8f, 12f)
            curveTo(8f, 13.4001f, 8f, 14.1002f, 8.27248f, 14.635f)
            curveTo(8.51217f, 15.1054f, 8.89462f, 15.4878f, 9.36502f, 15.7275f)
            curveTo(9.54965f, 15.8216f, 9.75397f, 15.8832f, 10f, 15.9235f)
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
            moveTo(10.9235f, 5f)
            curveTo(10.8832f, 4.75397f, 10.8216f, 4.54965f, 10.7275f, 4.36502f)
            curveTo(10.4878f, 3.89462f, 10.1054f, 3.51217f, 9.63498f, 3.27248f)
            curveTo(9.1002f, 3f, 8.40013f, 3f, 7f, 3f)
            curveTo(5.59987f, 3f, 4.8998f, 3f, 4.36502f, 3.27248f)
            curveTo(3.89462f, 3.51217f, 3.51217f, 3.89462f, 3.27248f, 4.36502f)
            curveTo(3f, 4.8998f, 3f, 5.59987f, 3f, 7f)
            curveTo(3f, 8.40013f, 3f, 9.1002f, 3.27248f, 9.63498f)
            curveTo(3.51217f, 10.1054f, 3.89462f, 10.4878f, 4.36502f, 10.7275f)
            curveTo(4.54965f, 10.8216f, 4.75397f, 10.8832f, 5f, 10.9235f)
        }
        }.build()

        return _squareStack!!
    }

private var _squareStack: ImageVector? = null
