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

val HugeIcons.DatabaseZap: ImageVector
    get() {
        if (_databaseZap != null) {
            return _databaseZap!!
        }
        _databaseZap = ImageVector.Builder(
            name = "DatabaseZap",
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
            moveTo(20f, 5f)
            arcTo(8f, 3f, 0f, true, false, 4f, 5f)
            arcTo(8f, 3f, 0f, true, false, 20f, 5f)
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
            moveTo(12f, 15f)
            curveTo(7.58172f, 15f, 4f, 13.6569f, 4f, 12f)
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
            moveTo(12f, 22f)
            curveTo(7.58172f, 22f, 4f, 20.6569f, 4f, 19f)
            verticalLineTo(5f)
            moveTo(20f, 5f)
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
            moveTo(18.0801f, 14f)
            lineTo(16.7431f, 16.5528f)
            curveTo(16.4033f, 17.2014f, 16.2335f, 17.5257f, 16.387f, 17.7629f)
            curveTo(16.5405f, 18f, 16.9203f, 18f, 17.68f, 18f)
            horizontalLineTo(18.4802f)
            curveTo(19.2398f, 18f, 19.6196f, 18f, 19.7732f, 18.2371f)
            curveTo(19.9267f, 18.4743f, 19.7568f, 18.7986f, 19.4171f, 19.4472f)
            lineTo(18.0801f, 22f)
        }
        }.build()

        return _databaseZap!!
    }

private var _databaseZap: ImageVector? = null
