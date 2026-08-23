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

val HugeIcons.UserEdit01: ImageVector
    get() {
        if (_userEdit01 != null) {
            return _userEdit01!!
        }
        _userEdit01 = ImageVector.Builder(
            name = "UserEdit01",
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
            moveTo(15f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 7f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 15f, 6.5f)
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
            moveTo(20.6887f, 15.4339f)
            lineTo(20.0661f, 14.8113f)
            curveTo(19.651f, 14.3962f, 18.978f, 14.3962f, 18.5629f, 14.8113f)
            lineTo(15.2141f, 18.1601f)
            curveTo(14.769f, 18.6052f, 14.4656f, 19.1722f, 14.3421f, 19.7895f)
            lineTo(14f, 21.5f)
            lineTo(15.7105f, 21.1579f)
            curveTo(16.3278f, 21.0344f, 16.8948f, 20.731f, 17.3399f, 20.2859f)
            lineTo(20.6887f, 16.9371f)
            curveTo(21.1038f, 16.522f, 21.1038f, 15.849f, 20.6887f, 15.4339f)
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
            moveTo(3f, 20.5002f)
            curveTo(3.28417f, 16.8058f, 6.3f, 13.7193f, 10.0008f, 13.5379f)
            curveTo(10.3134f, 13.5226f, 10.6446f, 13.5097f, 11f, 13.5f)
            lineTo(11.995f, 13.5663f)
            curveTo(12.6939f, 13.6129f, 13.3665f, 13.7543f, 14f, 13.9777f)
        }
        }.build()

        return _userEdit01!!
    }

private var _userEdit01: ImageVector? = null
